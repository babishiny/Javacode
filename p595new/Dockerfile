FROM ubuntu:16.04
MAINTAINER Babi Shiny (babishiny@gmail.com)
ENV JAVA_HOME /usr/libexec/java_home
RUN export JAVA_HOME
RUN apt-get update -y
RUN apt-get install -y maven
COPY pom.xml /usr/local/service/pom.xml
COPY src/test/java /usr/local/service
WORKDIR /usr/local/service
RUN mvn package
