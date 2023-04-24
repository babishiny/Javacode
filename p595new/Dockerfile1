FROM ubuntu:16.04
MAINTAINER Babi Shiny (babishiny@gmail.com)
RUN yum update
RUN install java-1.8.0-openjdk
RUN apt-get update -y
RUN apt-get install -y maven
COPY pom.xml /usr/local/service/pom.xml
COPY src/test/java /usr/local/service
WORKDIR /usr/local/service
RUN mvn package