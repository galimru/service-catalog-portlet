package ru.lanit.samara.portlet.logic;

import ru.lanit.samara.portlet.model.Catalog;
import ru.lanit.samara.portlet.model.Department;
import ru.lanit.samara.portlet.model.Service;
import ru.lanit.samara.portlet.webservice.ServiceItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Galimov Ruslan
 */
public class CatalogBuilder {

    private ServiceItem[] services;

    public CatalogBuilder(ServiceItem[] services) {
        this.services = services;
    }

    public Catalog build() {
        Catalog catalog = new Catalog();
        List<Department> departments = new ArrayList<Department>();
        for (ServiceItem elService : services) {
            Department department = new Department(elService.getDepartment(), null);
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
        catalog.setDepartments(departments);
        return catalog;
    }
}
