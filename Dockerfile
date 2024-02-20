# Use the official OpenJDK base image with version 17
# Use an official OpenJDK runtime as a parent image
FROM openjdk:21-ea-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file into the container at /app
COPY target/restcaller-1.0.0-SNAPSHOT.jar /app/restcaller.jar

# Expose the port that your Spring Boot application will run on
EXPOSE 8080

# Specify the command to run on container start
CMD ["java", "-jar", "restcaller.jar"]
