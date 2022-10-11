# dummy apiss Project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```shell script
mvn compile quarkus:dev
```

## Deploy to cluster

You can run your application in dev mode that enables live coding using:
```shell script
mvn clean package -Dquarkus.kubernetes.deploy=true
```

