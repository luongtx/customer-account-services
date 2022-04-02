FROM openjdk:8-jdk-alpine
MAINTAINER Luong Tran <luongtx@gmail.com>
WORKDIR /myapp
COPY target/account-service.jar /myapp
EXPOSE 2222
ENTRYPOINT ["java", "-jar", "account-service.jar"]