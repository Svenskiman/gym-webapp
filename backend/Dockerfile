# Fetch JDK
FROM eclipse-temurin:25-jdk

WORKDIR /app

# Copy Maven
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline

COPY src ./src

CMD ["./mvnw", "spring-boot:run"]