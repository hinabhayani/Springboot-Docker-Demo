# define base docker image
FROM openjdk:8
LABEL maintainer="javaguides.net"
ADD target/springboot-docker-demo.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]
