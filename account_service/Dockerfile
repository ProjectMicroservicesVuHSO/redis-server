FROM openjdk:17-jdk

LABEL authors="vuhso04"

WORKDIR /app

COPY target/*.jar app.jar

EXPOSE 8081

CMD ["java", "-jar", "app.jar"]