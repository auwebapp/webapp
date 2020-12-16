FROM openjdk:8
ADD target/docker-zuul-gateway.jar docker-zuul-gateway.jar
EXPOSE 8085
ENTRYPOINT ["java","-jar","docker-zuul-gateway.jar"]