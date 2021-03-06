package com.ttdev.ss;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.0-milestone2
 * 2019-05-18T16:12:50.889+01:00
 * Generated source version: 3.0.0-milestone2
 * 
 */
@WebService(targetNamespace = "http://ttdev.com/ss", name = "SimpleService")
@XmlSeeAlso({ObjectFactory.class})
public interface SimpleService {

    @WebMethod(action = "http://ttdev.com/ss/concat")
    @RequestWrapper(localName = "concat", targetNamespace = "http://ttdev.com/ss", className = "com.ttdev.ss.Concat")
    @ResponseWrapper(localName = "concatResponse", targetNamespace = "http://ttdev.com/ss", className = "com.ttdev.ss.ConcatResponse")
    @WebResult(name = "r", targetNamespace = "")
    public java.lang.String concat(
        @WebParam(name = "s1", targetNamespace = "")
        java.lang.String s1,
        @WebParam(name = "s2", targetNamespace = "")
        java.lang.String s2
    );
}
