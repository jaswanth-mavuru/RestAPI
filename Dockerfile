FROM openjdk:11
EXPOSE 8082
ADD target/Dockerr-0.0.1-SNAPSHOT.jar Dockerr-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Dockerr-0.0.1-SNAPSHOT.jar"]