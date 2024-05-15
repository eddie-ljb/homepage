FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
ARG JAR_FILE
COPY build/libs/BaderHomepage-0.0.1-SNAPSHOT.jar BaderHomepage-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/BaderHomepage-0.0.1-SNAPSHOT.jar"]