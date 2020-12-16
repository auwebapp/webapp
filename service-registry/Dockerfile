FROM openjdk:8
ADD target/docker-service-image.jar docker-service-image.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","docker-service-image.jar"]