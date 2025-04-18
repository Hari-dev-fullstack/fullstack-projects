FROM openjdk:17
COPY . /app
WORKDIR /app
RUN ./mvnw clean install
CMD ["java", "-jar", "target/billing-service.jar"]