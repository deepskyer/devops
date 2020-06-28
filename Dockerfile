FROM openjdk:8
EXPOSE 8080
ADD target/spring-docker-jenkins.jar spring-docker-jenkins.jar
ENTRYPOINT ["java", "-jar", "spring-docker-jenkins.jar"]
