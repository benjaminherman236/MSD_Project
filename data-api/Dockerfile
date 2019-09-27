FROM gradle:jdk10 as builder
COPY --chown=gradle . /app
WORKDIR /app
RUN gradle bootJar

FROM openjdk:8-jdk-alpine
EXPOSE 8080
VOLUME /tmp
COPY --from=builder app/build/libs/*.jar /app/data-api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "app/data-api-0.0.1-SNAPSHOT.jar"]