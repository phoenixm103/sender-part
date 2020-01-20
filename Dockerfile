FROM openjdk:8-jdk-alpine
EXPOSE 8080
WORKDIR /app
COPY target/raabbitmq-sender-part-0.0.1-SNAPSHOT.jar .
ENTRYPOINT [ "java", "-jar", "raabbitmq-sender-part-0.0.1-SNAPSHOT.jar" ]
