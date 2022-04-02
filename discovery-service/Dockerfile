FROM openjdk:8-jdk-alpine
MAINTAINER Luong Tran <luongtx@gmail.com>
WORKDIR /myapp
COPY target/discovery-service.jar /myapp
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "discovery-service.jar"]