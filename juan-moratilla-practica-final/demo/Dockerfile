FROM adoptopenjdk/openjdk11:x86_64-alpine-jdk-11.0.4_11

COPY ./target/demo-0.0.1-SNAPSHOT.jar /usr/app/app.jar

WORKDIR /usr/app

RUN sh -c 'touch app.jar'

ENTRYPOINT ["java","-jar","app.jar"]
