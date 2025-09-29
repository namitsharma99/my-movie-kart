# Use a Java 21 base image
FROM eclipse-temurin:21-jre-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the executable JAR file into the container
COPY target/*.jar app.jar

# Expose the port your Spring Boot application runs on (default is 8080)
EXPOSE 8091

# Define the command to run your application
ENTRYPOINT ["java", "-jar", "app.jar"]
