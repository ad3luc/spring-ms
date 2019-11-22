FROM openjdk:8-slim

RUN apt-get update
RUN apt-get -y install wget

ENV DOCKERIZE_VERSION v0.6.1
RUN wget https://github.com/jwilder/dockerize/releases/download/$DOCKERIZE_VERSION/dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && tar -C /usr/local/bin -xzvf dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz

ARG JAR_FILE
COPY target/dependency /root/.m2/repository
COPY target/${JAR_FILE} /opt/local/dexm/ms/ms.jar

WORKDIR /opt/local/dexm/ms
ENTRYPOINT ["dockerize", "-timeout", "2m", "-wait", "http://config:8888/actuator/info", "java", "-Xmx256m", "-jar", "/opt/local/dexm/ms/ms.jar"]