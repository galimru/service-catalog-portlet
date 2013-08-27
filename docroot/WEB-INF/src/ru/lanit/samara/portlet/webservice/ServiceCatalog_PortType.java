/**
 * ServiceCatalog_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ru.lanit.samara.portlet.webservice;

public interface ServiceCatalog_PortType extends java.rmi.Remote {
    public ru.lanit.samara.portlet.webservice.ServiceItem[] getServices(java.lang.String owner) throws java.rmi.RemoteException;
    public java.lang.String serviceInfo(java.lang.String code) throws java.rmi.RemoteException, ru.lanit.samara.portlet.webservice.ServiceFault;
}
