/**
 * ServiceCatalog_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.lanit.samara.portlet.webservice;

public class ServiceCatalog_ServiceLocator extends org.apache.axis.client.Service implements ru.lanit.samara.portlet.webservice.ServiceCatalog_Service {

    public ServiceCatalog_ServiceLocator() {
    }


    public ServiceCatalog_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServiceCatalog_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServiceCatalogPort
    private java.lang.String ServiceCatalogPort_address = "http://127.0.0.1/core-process-coreps-webservices-2.1.1-SNAPSHOT/ServiceCatalog";

    public java.lang.String getServiceCatalogPortAddress() {
        return ServiceCatalogPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServiceCatalogPortWSDDServiceName = "ServiceCatalogPort";

    public java.lang.String getServiceCatalogPortWSDDServiceName() {
        return ServiceCatalogPortWSDDServiceName;
    }

    public void setServiceCatalogPortWSDDServiceName(java.lang.String name) {
        ServiceCatalogPortWSDDServiceName = name;
    }

    public ru.lanit.samara.portlet.webservice.ServiceCatalog_PortType getServiceCatalogPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServiceCatalogPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServiceCatalogPort(endpoint);
    }

    public ru.lanit.samara.portlet.webservice.ServiceCatalog_PortType getServiceCatalogPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ru.lanit.samara.portlet.webservice.ServiceCatalogBindingStub _stub = new ru.lanit.samara.portlet.webservice.ServiceCatalogBindingStub(portAddress, this);
            _stub.setPortName(getServiceCatalogPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServiceCatalogPortEndpointAddress(java.lang.String address) {
        ServiceCatalogPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ru.lanit.samara.portlet.webservice.ServiceCatalog_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                ru.lanit.samara.portlet.webservice.ServiceCatalogBindingStub _stub = new ru.lanit.samara.portlet.webservice.ServiceCatalogBindingStub(new java.net.URL(ServiceCatalogPort_address), this);
                _stub.setPortName(getServiceCatalogPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ServiceCatalogPort".equals(inputPortName)) {
            return getServiceCatalogPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://catalog.portal.cp.org/", "ServiceCatalog");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://catalog.portal.cp.org/", "ServiceCatalogPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServiceCatalogPort".equals(portName)) {
            setServiceCatalogPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
