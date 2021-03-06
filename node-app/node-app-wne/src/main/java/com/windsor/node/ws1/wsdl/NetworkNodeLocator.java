/*
Copyright (c) 2009, The Environmental Council of the States (ECOS)
All rights reserved.

Redistribution and use in source and binary forms, with or without
modification, are permitted provided that the following conditions
are met:

 * Redistributions of source code must retain the above copyright
   notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright
   notice, this list of conditions and the following disclaimer in the
   documentation and/or other materials provided with the distribution.
 * Neither the name of the ECOS nor the names of its contributors may
   be used to endorse or promote products derived from this software
   without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
"AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING,
BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES;
LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER
CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT
LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN
ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
POSSIBILITY OF SUCH DAMAGE.
 */

/**
 * NetworkNodeLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package com.windsor.node.ws1.wsdl;

public class NetworkNodeLocator extends org.apache.axis.client.Service
        implements NetworkNode {

    static final long serialVersionUID = 1;

    /**
     * A set of services for the National Environmental Information Exchange
     * Network (NEIEN)
     */

    public NetworkNodeLocator() {
    }

    public NetworkNodeLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public NetworkNodeLocator(java.lang.String wsdlLoc,
            javax.xml.namespace.QName sName)
            throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for NetworkNodePortType
    private java.lang.String NetworkNodePortType_address = "https://epacdxnode.net/cdx/services/NetworkNodePortType_V10";

    public java.lang.String getNetworkNodePortTypeAddress() {
        return NetworkNodePortType_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String NetworkNodePortTypeWSDDServiceName = "NetworkNodePortType";

    public java.lang.String getNetworkNodePortTypeWSDDServiceName() {
        return NetworkNodePortTypeWSDDServiceName;
    }

    public void setNetworkNodePortTypeWSDDServiceName(java.lang.String name) {
        NetworkNodePortTypeWSDDServiceName = name;
    }

    public NetworkNodePortType_PortType getNetworkNodePortType()
            throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(NetworkNodePortType_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getNetworkNodePortType(endpoint);
    }

    public NetworkNodePortType_PortType getNetworkNodePortType(
            java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            NetworkNodeBindingStub _stub = new NetworkNodeBindingStub(
                    portAddress, this);
            _stub.setPortName(getNetworkNodePortTypeWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setNetworkNodePortTypeEndpointAddress(java.lang.String address) {
        NetworkNodePortType_address = address;
    }

    /**
     * For the given interface, get the stub implementation. If this service has
     * no port for the given interface, then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface)
            throws javax.xml.rpc.ServiceException {
        try {
            if (NetworkNodePortType_PortType.class
                    .isAssignableFrom(serviceEndpointInterface)) {
                NetworkNodeBindingStub _stub = new NetworkNodeBindingStub(
                        new java.net.URL(NetworkNodePortType_address), this);
                _stub.setPortName(getNetworkNodePortTypeWSDDServiceName());
                return _stub;
            }
        } catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException(
                "There is no stub implementation for the interface:  "
                        + (serviceEndpointInterface == null ? "null"
                                : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation. If this service has
     * no port for the given interface, then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName,
            Class serviceEndpointInterface)
            throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("NetworkNodePortType".equals(inputPortName)) {
            return getNetworkNodePortType();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName(
                "http://www.ExchangeNetwork.net/schema/v1.0/node.wsdl",
                "NetworkNode");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName(
                    "http://www.ExchangeNetwork.net/schema/v1.0/node.wsdl",
                    "NetworkNodePortType"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(java.lang.String portName,
            java.lang.String address) throws javax.xml.rpc.ServiceException {

        if ("NetworkNodePortType".equals(portName)) {
            setNetworkNodePortTypeEndpointAddress(address);
        } else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(
                    " Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(javax.xml.namespace.QName portName,
            java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}