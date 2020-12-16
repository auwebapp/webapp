FROM openjdk:8
ADD target/docker-user-authentication.jar docker-user-authentication.jar
EXPOSE 9093
ENTRYPOINT ["java","-jar","docker-user-authentication.jar"]