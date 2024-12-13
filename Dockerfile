FROM openjdk:23
LABEL authors="rhueh"

ADD target/miniservice-0.0.1-SNAPSHOT.jar app.jar

EXPOSE 8761

ENTRYPOINT ["java", "-jar", "app.jar"]