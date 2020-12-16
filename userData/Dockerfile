FROM openjdk:8
ADD target/docker-user-data.jar docker-user-data.jar
EXPOSE 8960
ENTRYPOINT ["java","-jar","docker-user-data.jar"]