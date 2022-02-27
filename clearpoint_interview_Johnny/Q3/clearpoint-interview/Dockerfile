FROM maven:3.6.3-jdk-8-slim AS MAVEN_BUILD

COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/

RUN mvn clean install

WORKDIR /build/target/

ENTRYPOINT ["java", "-jar", "clearpoint-interview-0.0.1-SNAPSHOT.jar"]


