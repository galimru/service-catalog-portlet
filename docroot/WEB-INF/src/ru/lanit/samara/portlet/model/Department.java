package ru.lanit.samara.portlet.model;

import java.util.List;

/**
 * Created by Galimov Ruslan
 */
public class Department {

    private String code;
    private String name;
    private List<Service> services;

    public Department() {
    }

    public Department(String code, String name, List<Service> services) {
        this.code = code;
        this.name = name;
        this.services = services;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        if (!code.equals(that.code)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
}
