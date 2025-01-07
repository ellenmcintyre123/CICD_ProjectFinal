
# Use an openjdk image from Docker Hub
FROM openjdk:17-jdk-alpine

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from your local machine to the container
COPY target/CICD_Project.jar CICD_Project.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "CICD_Project.jar"]