/**
 * CalculatriceServicePortBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fr.carsat.service.soap.document;

public class CalculatriceServicePortBindingStub extends org.apache.axis.client.Stub implements fr.carsat.service.soap.document.CalculatriceContrat {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[5];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Soustraction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "RequeteSoustraction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "RequeteSoustraction"), fr.carsat.service.soap.document.RequeteSoustraction.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "ReponseSoustraction"));
        oper.setReturnClass(fr.carsat.service.soap.document.ReponseSoustraction.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "ReponseSoustraction"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Division");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "RequeteDivision"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "RequeteDivision"), fr.carsat.service.soap.document.RequeteDivision.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "ReponseDivision"));
        oper.setReturnClass(fr.carsat.service.soap.document.ReponseDivision.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "ReponseDivision"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Notification");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "RequeteNotification"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "RequeteNotification"), fr.carsat.service.soap.document.RequeteNotification.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Multiplication");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "RequeteMultiplication"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "RequeteMultiplication"), fr.carsat.service.soap.document.RequeteMultiplication.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "ReponseMultiplication"));
        oper.setReturnClass(fr.carsat.service.soap.document.ReponseMultiplication.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "ReponseMultiplication"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Addition");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "RequeteAddition"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "RequeteAddition"), fr.carsat.service.soap.document.RequeteAddition.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "ReponseAddition"));
        oper.setReturnClass(fr.carsat.service.soap.document.ReponseAddition.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "ReponseAddition"));
        oper.setStyle(org.apache.axis.constants.Style.DOCUMENT);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

    }

    public CalculatriceServicePortBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public CalculatriceServicePortBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public CalculatriceServicePortBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "ReponseAddition");
            cachedSerQNames.add(qName);
            cls = fr.carsat.service.soap.document.ReponseAddition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "ReponseDivision");
            cachedSerQNames.add(qName);
            cls = fr.carsat.service.soap.document.ReponseDivision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "ReponseMultiplication");
            cachedSerQNames.add(qName);
            cls = fr.carsat.service.soap.document.ReponseMultiplication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "ReponseSoustraction");
            cachedSerQNames.add(qName);
            cls = fr.carsat.service.soap.document.ReponseSoustraction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "RequeteAddition");
            cachedSerQNames.add(qName);
            cls = fr.carsat.service.soap.document.RequeteAddition.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "RequeteDivision");
            cachedSerQNames.add(qName);
            cls = fr.carsat.service.soap.document.RequeteDivision.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "RequeteMultiplication");
            cachedSerQNames.add(qName);
            cls = fr.carsat.service.soap.document.RequeteMultiplication.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "RequeteNotification");
            cachedSerQNames.add(qName);
            cls = fr.carsat.service.soap.document.RequeteNotification.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://document.soap.service.carsat.fr/", "RequeteSoustraction");
            cachedSerQNames.add(qName);
            cls = fr.carsat.service.soap.document.RequeteSoustraction.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public fr.carsat.service.soap.document.ReponseSoustraction soustraction(fr.carsat.service.soap.document.RequeteSoustraction parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:min");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Soustraction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (fr.carsat.service.soap.document.ReponseSoustraction) _resp;
            } catch (java.lang.Exception _exception) {
                return (fr.carsat.service.soap.document.ReponseSoustraction) org.apache.axis.utils.JavaUtils.convert(_resp, fr.carsat.service.soap.document.ReponseSoustraction.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public fr.carsat.service.soap.document.ReponseDivision division(fr.carsat.service.soap.document.RequeteDivision parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:div");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Division"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (fr.carsat.service.soap.document.ReponseDivision) _resp;
            } catch (java.lang.Exception _exception) {
                return (fr.carsat.service.soap.document.ReponseDivision) org.apache.axis.utils.JavaUtils.convert(_resp, fr.carsat.service.soap.document.ReponseDivision.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void notification(fr.carsat.service.soap.document.RequeteNotification parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:notify");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Notification"));

        setRequestHeaders(_call);
        setAttachments(_call);
        _call.invokeOneWay(new java.lang.Object[] {parameters});

    }

    public fr.carsat.service.soap.document.ReponseMultiplication multiplication(fr.carsat.service.soap.document.RequeteMultiplication parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:mul");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Multiplication"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (fr.carsat.service.soap.document.ReponseMultiplication) _resp;
            } catch (java.lang.Exception _exception) {
                return (fr.carsat.service.soap.document.ReponseMultiplication) org.apache.axis.utils.JavaUtils.convert(_resp, fr.carsat.service.soap.document.ReponseMultiplication.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public fr.carsat.service.soap.document.ReponseAddition addition(fr.carsat.service.soap.document.RequeteAddition parameters) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:add");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("", "Addition"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (fr.carsat.service.soap.document.ReponseAddition) _resp;
            } catch (java.lang.Exception _exception) {
                return (fr.carsat.service.soap.document.ReponseAddition) org.apache.axis.utils.JavaUtils.convert(_resp, fr.carsat.service.soap.document.ReponseAddition.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
