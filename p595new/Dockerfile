FROM ubuntu
MAINTAINER Babi Shiny (babishiny@gmail.com)
RUN apt-get update -y
RUN apt-get install -y maven
COPY pom.xml /usr/local/service/pom.xml
COPY src/test/java /usr/local/service
WORKDIR /usr/local/service
RUN mvn package
