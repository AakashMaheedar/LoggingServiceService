FROM openjdk
FROM openjdk:8
EXPOSE 9000
ADD target/loggingservice.jar loggingservice.jar
ENTRYPOINT ["java","-jar","loggingservice.jar"]