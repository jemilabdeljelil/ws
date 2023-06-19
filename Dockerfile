FROM openjdk:8-jdk-alpine
RUN addgroup -S anrpts && adduser -S anrpts -G anrpts
USER anrpts:anrpts
RUN mkdir -p /config
ENV SPRING_CONFIG_NAME=application
ENV SPRING_CONFIG_LOCATION=file:///config
WORKDIR /   # WORKDIR /bar

ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8969
ENTRYPOINT ["java","-jar","/app.jar"]