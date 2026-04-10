# Use official Java image
FROM eclipse-temurin:17-jdk

# Set working directory
WORKDIR /app

# Copy all files
COPY . .

# Build the application
RUN chmod +x mvnw
RUN ./mvnw clean install -DskipTests

# Run the jar
CMD ["java", "-jar", "target/*.jar"]