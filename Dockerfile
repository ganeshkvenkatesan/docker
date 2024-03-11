FROM openjdk:17-jdk-alpine
COPY target/docker-0.0.1-SNAPSHOT.jar docker-java.jar
ENTRYPOINT ["java","-jar","/docker-java.jar"]