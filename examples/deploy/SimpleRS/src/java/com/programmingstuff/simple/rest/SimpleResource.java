package com.programmingstuff.simple.rest;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;

@Path("/rest")
public class SimpleResource {
    @Context
    private UriInfo context;

    /** Creates a new instance of SimpleResource */
    public SimpleResource() {
    }

    @GET
    @Produces("text/plain")
    public String getRequest() {
        return "Hello, this is a RESTful service.";
    }

    @PUT
    @Consumes("application/xml")
    public void putXml(String content) {

    }
}
