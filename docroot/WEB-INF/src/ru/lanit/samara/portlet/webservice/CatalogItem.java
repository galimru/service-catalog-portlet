/**
 * CatalogItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.lanit.samara.portlet.webservice;

public class CatalogItem  implements java.io.Serializable {
    private ru.lanit.samara.portlet.webservice.OwnerItem[] owners;

    private ru.lanit.samara.portlet.webservice.ServiceItem[] services;

    public CatalogItem() {
    }

    public CatalogItem(
           ru.lanit.samara.portlet.webservice.OwnerItem[] owners,
           ru.lanit.samara.portlet.webservice.ServiceItem[] services) {
           this.owners = owners;
           this.services = services;
    }


    /**
     * Gets the owners value for this CatalogItem.
     * 
     * @return owners
     */
    public ru.lanit.samara.portlet.webservice.OwnerItem[] getOwners() {
        return owners;
    }


    /**
     * Sets the owners value for this CatalogItem.
     * 
     * @param owners
     */
    public void setOwners(ru.lanit.samara.portlet.webservice.OwnerItem[] owners) {
        this.owners = owners;
    }

    public ru.lanit.samara.portlet.webservice.OwnerItem getOwners(int i) {
        return this.owners[i];
    }

    public void setOwners(int i, ru.lanit.samara.portlet.webservice.OwnerItem _value) {
        this.owners[i] = _value;
    }


    /**
     * Gets the services value for this CatalogItem.
     * 
     * @return services
     */
    public ru.lanit.samara.portlet.webservice.ServiceItem[] getServices() {
        return services;
    }


    /**
     * Sets the services value for this CatalogItem.
     * 
     * @param services
     */
    public void setServices(ru.lanit.samara.portlet.webservice.ServiceItem[] services) {
        this.services = services;
    }

    public ru.lanit.samara.portlet.webservice.ServiceItem getServices(int i) {
        return this.services[i];
    }

    public void setServices(int i, ru.lanit.samara.portlet.webservice.ServiceItem _value) {
        this.services[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CatalogItem)) return false;
        CatalogItem other = (CatalogItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.owners==null && other.getOwners()==null) || 
             (this.owners!=null &&
              java.util.Arrays.equals(this.owners, other.getOwners()))) &&
            ((this.services==null && other.getServices()==null) || 
             (this.services!=null &&
              java.util.Arrays.equals(this.services, other.getServices())));
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
        if (getOwners() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOwners());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOwners(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getServices() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getServices());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getServices(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CatalogItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://catalog.portal.cp.org/", "catalogItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("owners");
        elemField.setXmlName(new javax.xml.namespace.QName("", "owners"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalog.portal.cp.org/", "ownerItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("services");
        elemField.setXmlName(new javax.xml.namespace.QName("", "services"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://catalog.portal.cp.org/", "serviceItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
