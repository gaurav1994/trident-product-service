FROM openjdk:17-jdk-slim
WORKDIR /work/
COPY ./target/*.jar /work/
CMD ["java", "-jar", "trident-product-service_0.0.1.jar"]