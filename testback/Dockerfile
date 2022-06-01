# docker image
FROM openjdk:11
LABEL maintainer="springtest.net"
ADD target/testback-0.0.1-SNAPSHOT.jar springboot-docker.jar
ENTRYPOINT [ "java", "-jar", "springboot-docker.jar" ]