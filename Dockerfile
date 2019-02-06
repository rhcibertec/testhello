FROM java:8
EXPOSE 8010 
ADD ./hello-world-microservice.jar hello-world-microservice.jar
ENTRYPOINT ["java", "-jar", "hello-world-microservice.jar"]
