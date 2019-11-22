#!/bin/bash
cd ms-account
mvn clean package -DskipTests=true -P dockerized,prepare-dependencies-folder | tail -7
mvn package -DskipTests=true -P dockerize-ms,dockerized
cd ../ms-api
mvn clean package -DskipTests=true -P dockerized,prepare-dependencies-folder | tail -7
mvn package -DskipTests=true -P dockerize-ms,dockerized
cd ../ms-product
mvn clean package -DskipTests=true -P dockerized,prepare-dependencies-folder | tail -7
mvn package -DskipTests=true -P dockerize-ms,dockerized
cd ../ms-registry
mvn clean package -DskipTests=true -P dockerized,prepare-dependencies-folder | tail -7
mvn package -DskipTests=true -P dockerize-ms,dockerized
cd ../ms-config
mvn clean package -DskipTests=true -P dockerized,prepare-dependencies-folder | tail -7
mvn package -DskipTests=true -P dockerize-ms,dockerized
cd ..
