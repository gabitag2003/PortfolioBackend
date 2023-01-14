
FROM amazoncorretto:17-alpine-jdk
MAINTAINER  emaaristimuno
COPY target/gag-0.0.1-SNAPSHOT.jar  gag-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar", "/gag-0.0.1-SNAPSHOT.jar"]

