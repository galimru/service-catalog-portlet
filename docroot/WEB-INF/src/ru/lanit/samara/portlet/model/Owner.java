package ru.lanit.samara.portlet.model;

/**
 * Created by Galimov Ruslan
 */
public class Owner {

    private String code;
    private String name;

    public Owner() {
    }

    public Owner(String code, String name) {
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
        Owner owner = (Owner) o;
        if (!code.equals(owner.code)) return false;
        return true;
    }

    @Override
    public int hashCode() {
        return code.hashCode();
    }
}
