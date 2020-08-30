FROM openjdk:8-jdk-alpine
MAINTAINER maximatech.com.br
VOLUME /tmp
EXPOSE 8082
ADD target/freight-0.0.1-SNAPSHOT.jar freight.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/freight.jar"]