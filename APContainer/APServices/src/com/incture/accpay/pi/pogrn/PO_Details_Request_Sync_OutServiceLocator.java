package com.incture.accpay.pi.pogrn;
/**
 * PO_Details_Request_Sync_OutServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

public class PO_Details_Request_Sync_OutServiceLocator extends org.apache.axis.client.Service implements PO_Details_Request_Sync_OutService {

    public PO_Details_Request_Sync_OutServiceLocator() {
    }


    public PO_Details_Request_Sync_OutServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public PO_Details_Request_Sync_OutServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for HTTP_Port
    private java.lang.String HTTP_Port_address = "https://p1015-iflmap.hcisbp.ap1.hana.ondemand.com:443/cxf/testrfc";

    public java.lang.String getHTTP_PortAddress() {
        return HTTP_Port_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String HTTP_PortWSDDServiceName = "HTTP_Port";

    public java.lang.String getHTTP_PortWSDDServiceName() {
        return HTTP_PortWSDDServiceName;
    }

    public void setHTTP_PortWSDDServiceName(java.lang.String name) {
        HTTP_PortWSDDServiceName = name;
    }

    public PO_Details_Request_Sync_Out getHTTP_Port() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(HTTP_Port_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getHTTP_Port(endpoint);
    }

    public PO_Details_Request_Sync_Out getHTTP_Port(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            PO_Details_Request_Sync_OutBindingStub _stub = new PO_Details_Request_Sync_OutBindingStub(portAddress, this);
            _stub.setPortName(getHTTP_PortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setHTTP_PortEndpointAddress(java.lang.String address) {
        HTTP_Port_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (PO_Details_Request_Sync_Out.class.isAssignableFrom(serviceEndpointInterface)) {
                PO_Details_Request_Sync_OutBindingStub _stub = new PO_Details_Request_Sync_OutBindingStub(new java.net.URL(HTTP_Port_address), this);
                _stub.setPortName(getHTTP_PortWSDDServiceName());
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
        if ("HTTP_Port".equals(inputPortName)) {
            return getHTTP_Port();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn://incture.com/AccountPayable", "PO_Details_Request_Sync_OutService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn://incture.com/AccountPayable", "HTTP_Port"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("HTTP_Port".equals(portName)) {
            setHTTP_PortEndpointAddress(address);
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
