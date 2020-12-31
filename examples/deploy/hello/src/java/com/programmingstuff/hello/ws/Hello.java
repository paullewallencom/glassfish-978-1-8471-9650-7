package com.programmingstuff.hello.ws;

import com.programmingstuff.hello.HelloProvider;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService()
public class Hello {

    private HelloProvider provider;

    @WebMethod(operationName = "sayHello")
    public String sayHello(@WebParam(name = "name")
    String name) {
        return "Hello, " + provider.getName();
    }
}
