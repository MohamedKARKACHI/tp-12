package com.example;

import com.example.impl.HelloServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * Serveur SOAP utilisant Apache CXF
 */
public class Server {
    public static void main(String[] args) {
        // Adresse du service
        String address = "http://localhost:8080/services/hello";

        // Configuration de la factory
        JaxWsServerFactoryBean factory = new JaxWsServerFactoryBean();
        factory.setServiceClass(HelloServiceImpl.class);
        factory.setAddress(address);

        // Démarrage du serveur
        factory.create();

        System.out.println("WSDL: " + address + "?wsdl");
    }
}