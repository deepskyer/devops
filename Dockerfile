FROM openjdk:8
EXPOSE 8080
ADD target/spring-docker-jenkins.jar spring-docker-jenkins.jar
ENTRYPOINT ["java", "-jar", "spring-docker-jenkins.jar"]
RUN curl -fsSLO https://get.docker.com/builds/Linux/x86_64/docker-17.04.0-ce.tgz \
  && tar xzvf docker-17.04.0-ce.tgz \
  && mv docker/docker /usr/local/bin \
  && rm -r docker docker-17.04.0-ce.tgz
