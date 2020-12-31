package com.programmingstuff.simple.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class SimpleWS {

    /**
     * Web service operation
     */
    @WebMethod(operationName = "sayHello")
    public String sayHello(@WebParam(name = "name")
    String name) {
        return "Hello " + name + ", I am a web service.";
    }

}
