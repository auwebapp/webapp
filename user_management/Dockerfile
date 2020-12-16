FROM openjdk:8
ADD target/docker-user-management.jar docker-user-management.jar
EXPOSE 8084
ENTRYPOINT ["java","-jar","docker-user-management.jar"]