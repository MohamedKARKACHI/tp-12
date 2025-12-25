package com.example.api;

import com.example.model.Person;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

/**
 * Interface du service web
 */
@WebService(targetNamespace = "http://api.cxf.acme.com/")
public interface HelloService {

    /**
     * Retourne un message de salutation
     */
    @WebMethod(operationName = "SayHello")
    @WebResult(name = "greeting")
    String sayHello(@WebParam(name = "name") String name);

    /**
     * Recherche une personne par identifiant
     */
    @WebMethod(operationName = "FindPerson")
    @WebResult(name = "person")
    Person findPersonById(@WebParam(name = "id") String id);
}
