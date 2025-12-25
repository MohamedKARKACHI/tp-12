# Service Web SOAP avec Apache CXF

Application Java démontrant la création d'un service web SOAP avec Apache CXF.

## Technologies

- Java
- Apache CXF
- JAX-WS
- JAXB

## Structure

- `api/` - Interface du service
- `impl/` - Implémentation du service
- `model/` - Classes de données
- `client/` - Client de test

## Démarrage du serveur

```bash
mvn exec:java -Dexec.mainClass="com.example.Server"
```

## Test du client

```bash
mvn exec:java -Dexec.mainClass="com.example.client.ClientDemo"
```

## WSDL

Disponible sur `http://localhost:8080/services/hello?wsdl`
# tp-12
