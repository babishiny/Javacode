FROM ubuntu:16.04
MAINTAINER Babi Shiny (babishiny@gmail.com)
RUN apt-get update -y
RUN apt-get install -y maven
ARG JAVA=/Library/Java/JavaVirtualMachines/jdk-17.jdk/Contents/Home
ENV JAVA_HOME=${JAVA}
COPY pom.xml /usr/local/service/pom.xml
COPY src/test/java /usr/local/service
WORKDIR /usr/local/service
RUN mvn package