
FROM amazoncorretto:17-alpine-jdk
MAINTAINER  emaaristimuno
COPY target/gag-0.0.1-SNAPSHOT.jar  gag-app.jar
ENTRYPOINT ["java","-jar", "/gag-app.jar"]

