package ru.lanit.samara.portlet.model;

/**
 * Created by Galimov Ruslan
 */
public class Service {

    private String code;
    private String name;

    public Service() {
    }

    public Service(String code, String name) {
        this.code = code;
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        if (!code.equals(service.code)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
}
