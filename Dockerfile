# Use an official Java 8 image as the base
FROM openjdk:8-jdk-alpine

# Set the working directory to /app
WORKDIR /app

# Copy the Java source code into the container
COPY Prime.java /app/

# Compile the Java source code
RUN javac Prime.java

# Run the Java program when the container launches
CMD ["java", "Prime"]

