FROM eclipse-temurin:17-jre-alpine
WORKDIR /app

COPY build/libs/reto_aws-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8089

ENTRYPOINT ["java", "-jar", "app.jar"]