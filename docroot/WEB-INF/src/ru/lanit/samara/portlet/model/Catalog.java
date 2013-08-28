package ru.lanit.samara.portlet.model;

import java.util.List;

/**
 * Created by Galimov Ruslan
 */
public class Catalog {

    private List<Owner> owners;
    private List<Department> departments;

    public List<Owner> getOwners() {
        return owners;
    }

    public void setOwners(List<Owner> owners) {
        this.owners = owners;
    }

    public List<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(List<Department> departments) {
        this.departments = departments;
    }
}
