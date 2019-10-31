package com.redhat.batigerteam.examples;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class SampleWebService {

    @WebMethod
    public String sayHello(String name) {
        return String.format("Hello, %s", name);
    }
}