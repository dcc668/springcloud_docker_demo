FROM openjdk:8-jre
ENV APP_VERSION 1.0-SNAPSHOT
RUN mkdir /app
WORKDIR /app
COPY eureka_server-$APP_VERSION.jar app.jar
ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.jar"]
EXPOSE 8761