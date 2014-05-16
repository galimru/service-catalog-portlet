package ru.lanit.samara.portlet.logic;

import ru.lanit.samara.portlet.model.Catalog;
import ru.lanit.samara.portlet.model.Department;
import ru.lanit.samara.portlet.model.Owner;
import ru.lanit.samara.portlet.model.Service;
import ru.lanit.samara.portlet.webservice.CatalogItem;
import ru.lanit.samara.portlet.webservice.OwnerItem;
import ru.lanit.samara.portlet.webservice.ServiceItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Galimov Ruslan
 */
public class CatalogBuilder {

    private CatalogItem catalogItem;

    public CatalogBuilder(CatalogItem catalogItem) {
        this.catalogItem = catalogItem;
    }

    public Catalog build() {
        Catalog catalog = new Catalog();
        List<Owner> owners = new ArrayList<Owner>();
        if (catalogItem.getOwners() != null) {
            for (OwnerItem elOwner : catalogItem.getOwners()) {
                Owner owner = new Owner(elOwner.getCode(), elOwner.getName());
                if (!owners.contains(owner)) {
                    owners.add(owner);
                }
            }
        }
        catalog.setOwners(owners);
        List<Department> departments = new ArrayList<Department>();
        if (catalogItem.getServices() != null) {
            for (ServiceItem elService : catalogItem.getServices()) {
                Department department = new Department(elService.getDepartment(), null);
                if (!departments.contains(department)) {
                    departments.add(department);
                } else {
                    department = departments.get(departments.indexOf(department));
                }
                if (department.getServices() == null) {
                    department.setServices(new ArrayList<Service>());
                }
                department.getServices().add(new Service(elService.getServiceCode(), elService.getServiceName()));
            }
        }
        catalog.setDepartments(departments);
        return catalog;
    }
}
