FROM openjdk:11
COPY target/TestCart-0.0.1-SNAPSHOT.jar ./
EXPOSE 
CMD java -jar TestCart-0.0.1-SNAPSHOT.jar

