FROM openjdk:11
ADD target/RestAPI-0.0.1-SNAPSHOT.jar RestAPI-0.0.1-SNAPSHOT.jarr
ENTRYPOINT ["java","-jar","/RestAPI-0.0.1-SNAPSHOT.jar"]
