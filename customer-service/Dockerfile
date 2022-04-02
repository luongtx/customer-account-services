FROM openjdk:8-jdk-alpine
MAINTAINER Luong Tran <luongtx@gmail.com>
WORKDIR /myapp
COPY target/customer-service.jar /myapp
EXPOSE 3333
ENTRYPOINT ["java", "-jar", "customer-service.jar"]