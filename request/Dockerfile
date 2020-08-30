FROM openjdk:8-jdk-alpine
MAINTAINER maximatech.com.br
VOLUME /tmp
EXPOSE 8081
ADD target/request-0.0.1-SNAPSHOT.jar request.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/request.jar"]