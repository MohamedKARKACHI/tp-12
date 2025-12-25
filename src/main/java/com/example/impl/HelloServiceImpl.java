package com.example.impl;

import com.example.api.HelloService;
import com.example.model.Person;
import jakarta.jws.WebService;

/**
 * Implémentation du service web
 */
@WebService
public class HelloServiceImpl implements HelloService {

    /**
     * Génère un message de salutation
     */
    @Override
    public String sayHello(String name) {
        return "Bonjour, " + (name == null ? "inconnu" : name);
    }

    /**
     * Retourne une personne par identifiant
     */
    @Override
    public Person findPersonById(String id) {
        return new Person(id, "Ada Lovelace", 36);
    }
}