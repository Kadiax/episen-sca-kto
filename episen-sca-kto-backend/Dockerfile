FROM openjdk:13-jdk-alpine

RUN addgroup -S spring && adduser -S spring -G spring

USER spring:spring

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","/app.jar"]

LABEL version="1.0" maintainer="Kadia Toure <kadiditoure@gmail.com>"
