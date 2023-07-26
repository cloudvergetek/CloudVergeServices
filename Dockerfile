FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY target/cloudverge.jar cloudverge.jar
ENTRYPOINT ["java","-jar","/cloudverge.jar"]
docker build -t cloudverge.jar .
docker run -p 8080:8080 cloudverge.jar
