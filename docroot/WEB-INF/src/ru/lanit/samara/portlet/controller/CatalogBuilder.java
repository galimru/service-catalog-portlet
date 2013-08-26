package ru.lanit.samara.portlet.controller;

import ru.lanit.samara.portlet.model.Catalog;
import ru.lanit.samara.portlet.model.Department;
import ru.lanit.samara.portlet.model.Service;
import ru.lanit.samara.portlet.webservice.ServiceEntry;
import ru.lanit.samara.portlet.webservice.ServiceEntryDepartmentsEntry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Galimov Ruslan
 */
public class CatalogBuilder {

    private ServiceEntry[] services;

    public CatalogBuilder(ServiceEntry[] services) {
        this.services = services;
    }

    public Catalog build() {
        Catalog catalog = new Catalog();
        List<Department> departments = new ArrayList<Department>();
        for (ServiceEntry elService : services) {
            for (ServiceEntryDepartmentsEntry elDepartment : elService.getDepartments()) {
                Department department = new Department(elDepartment.getKey(), elDepartment.getValue(), null);
                if (!departments.contains(department)) {
                    departments.add(department);
                } else {
                    department = departments.get(departments.indexOf(department));
                }
                if (department.getServices() == null) {
                    department.setServices(new ArrayList<Service>());
                }
                department.getServices().add(new Service(elService.getCode(), elService.getName()));
            }
        }
        catalog.setDepartments(departments);
        return catalog;
    }
}
