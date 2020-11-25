FROM maven:3.6.3-jdk-11-slim AS maven-jar-build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean install

FROM openjdk:13-jdk-alpine
RUN addgroup -S back && adduser -S back -G back
RUN chown -R back /logs/
USER back
COPY --from=maven-jar-build /usr/src/app/target/episen-sca-kto-backend-0.0.2-RELEASE.jar /usr/app/app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/app/app.jar"]

LABEL version="2.0" maintainer="Kadia Toure <kadiditoure@gmail.com>"
