
package com.shanmukhawebservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "Shanmukhawebservie", targetNamespace = "http://shanmukhawebservice.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface Shanmukhawebservie {


    /**
     * 
     * @param num1
     * @param num2
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "add", targetNamespace = "http://shanmukhawebservice.com/", className = "com.shanmukhawebservice.Add")
    @ResponseWrapper(localName = "addResponse", targetNamespace = "http://shanmukhawebservice.com/", className = "com.shanmukhawebservice.AddResponse")
    @Action(input = "http://shanmukhawebservice.com/Shanmukhawebservie/addRequest", output = "http://shanmukhawebservice.com/Shanmukhawebservie/addResponse")
    public int add(
        @WebParam(name = "num1", targetNamespace = "")
        int num1,
        @WebParam(name = "num2", targetNamespace = "")
        int num2);

}
