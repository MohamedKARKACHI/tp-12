package com.example.client;

import com.example.api.HelloService;
import javax.xml.namespace.QName;
import jakarta.xml.ws.Service;
import java.net.URL;

/**
 * Client de test pour le service SOAP
 */
public class ClientDemo {
    public static void main(String[] args) throws Exception {
        // URL du WSDL
        URL wsdl = new URL("http://localhost:8080/services/hello?wsdl");

        // Configuration du QName
        QName qname = new QName("http://api.cxf.acme.com/", "HelloService");

        // Création du service
        Service svc = Service.create(wsdl, qname);

        // Obtention du port
        HelloService port = svc.getPort(HelloService.class);

        // Test des opérations
        System.out.println(port.sayHello("ClientJava"));
        System.out.println(port.findPersonById("P-777").getName());
    }
}
