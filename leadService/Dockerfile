FROM java:8-jre
MAINTAINER Nicola Gaffurini

ADD ./target/leadService.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/leadService.jar"]

EXPOSE 8899