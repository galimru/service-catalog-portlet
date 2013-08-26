/**
 * ServiceEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.lanit.samara.portlet.webservice;

public class ServiceEntry  implements java.io.Serializable {
    private ru.lanit.samara.portlet.webservice.ServiceEntryApplicantsEntry[] applicants;

    private ru.lanit.samara.portlet.webservice.ServiceEntryCategoriesEntry[] categories;

    private java.lang.String code;

    private ru.lanit.samara.portlet.webservice.ServiceEntryDepartmentsEntry[] departments;

    private java.lang.String name;

    public ServiceEntry() {
    }

    public ServiceEntry(
           ru.lanit.samara.portlet.webservice.ServiceEntryApplicantsEntry[] applicants,
           ru.lanit.samara.portlet.webservice.ServiceEntryCategoriesEntry[] categories,
           java.lang.String code,
           ru.lanit.samara.portlet.webservice.ServiceEntryDepartmentsEntry[] departments,
           java.lang.String name) {
           this.applicants = applicants;
           this.categories = categories;
           this.code = code;
           this.departments = departments;
           this.name = name;
    }


    /**
     * Gets the applicants value for this ServiceEntry.
     * 
     * @return applicants
     */
    public ru.lanit.samara.portlet.webservice.ServiceEntryApplicantsEntry[] getApplicants() {
        return applicants;
    }


    /**
     * Sets the applicants value for this ServiceEntry.
     * 
     * @param applicants
     */
    public void setApplicants(ru.lanit.samara.portlet.webservice.ServiceEntryApplicantsEntry[] applicants) {
        this.applicants = applicants;
    }


    /**
     * Gets the categories value for this ServiceEntry.
     * 
     * @return categories
     */
    public ru.lanit.samara.portlet.webservice.ServiceEntryCategoriesEntry[] getCategories() {
        return categories;
    }


    /**
     * Sets the categories value for this ServiceEntry.
     * 
     * @param categories
     */
    public void setCategories(ru.lanit.samara.portlet.webservice.ServiceEntryCategoriesEntry[] categories) {
        this.categories = categories;
    }


    /**
     * Gets the code value for this ServiceEntry.
     * 
     * @return code
     */
    public java.lang.String getCode() {
        return code;
    }


    /**
     * Sets the code value for this ServiceEntry.
     * 
     * @param code
     */
    public void setCode(java.lang.String code) {
        this.code = code;
    }


    /**
     * Gets the departments value for this ServiceEntry.
     * 
     * @return departments
     */
    public ru.lanit.samara.portlet.webservice.ServiceEntryDepartmentsEntry[] getDepartments() {
        return departments;
    }


    /**
     * Sets the departments value for this ServiceEntry.
     * 
     * @param departments
     */
    public void setDepartments(ru.lanit.samara.portlet.webservice.ServiceEntryDepartmentsEntry[] departments) {
        this.departments = departments;
    }


    /**
     * Gets the name value for this ServiceEntry.
     * 
     * @return name
     */
    public java.lang.String getName() {
        return name;
    }


    /**
     * Sets the name value for this ServiceEntry.
     * 
     * @param name
     */
    public void setName(java.lang.String name) {
        this.name = name;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ServiceEntry)) return false;
        ServiceEntry other = (ServiceEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.applicants==null && other.getApplicants()==null) || 
             (this.applicants!=null &&
              java.util.Arrays.equals(this.applicants, other.getApplicants()))) &&
            ((this.categories==null && other.getCategories()==null) || 
             (this.categories!=null &&
              java.util.Arrays.equals(this.categories, other.getCategories()))) &&
            ((this.code==null && other.getCode()==null) || 
             (this.code!=null &&
              this.code.equals(other.getCode()))) &&
            ((this.departments==null && other.getDepartments()==null) || 
             (this.departments!=null &&
              java.util.Arrays.equals(this.departments, other.getDepartments()))) &&
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              this.name.equals(other.getName())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getApplicants() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getApplicants());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getApplicants(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCategories() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCategories());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCategories(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCode() != null) {
            _hashCode += getCode().hashCode();
        }
        if (getDepartments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepartments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepartments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ServiceEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalog.portal.cp.org/", "serviceEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicants");
        elemField.setXmlName(new javax.xml.namespace.QName("", "applicants"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalog.portal.cp.org/", ">>serviceEntry>applicants>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categories");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categories"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalog.portal.cp.org/", ">>serviceEntry>categories>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new javax.xml.namespace.QName("", "code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departments");
        elemField.setXmlName(new javax.xml.namespace.QName("", "departments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalog.portal.cp.org/", ">>serviceEntry>departments>entry"));
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("", "entry"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
