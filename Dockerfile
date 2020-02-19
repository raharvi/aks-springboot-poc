FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} aks-springboot-poc.jar
ENTRYPOINT ["java","-jar","/aks-springboot-poc.jar"]