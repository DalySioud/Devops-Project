FROM openjdk:17-jdk-alpine
EXPOSE 8089
#ADD target/kaddem-0.0.1.jar kaddem-0.0.1.jar
# Install curl
RUN apk add --no-cache curl
# Download the jar file directly from Nexus
RUN curl -o /kaddem-0.0.1.jar http://192.168.178.48:8081/repository/maven-releases/tn/esprit/spring/kaddem/0.0.1/kaddem-0.0.1.jar
ENTRYPOINT ["java","-jar","/kaddem-0.0.1.jar"]
