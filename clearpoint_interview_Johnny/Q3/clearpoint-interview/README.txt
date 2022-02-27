Run unit test and build with Java 8 and maven installed

unzip and navigate to clearpoint-interview folder

mvn test
mvn install -D skipTests

in clearpoint-interview/target folder

java -jar clearpoint-interview-0.0.1-SNAPSHOT.jar <timestamp>

For example: docker run clearpoint_interview_johnny 1145


Build with docker

unzip. Using command line, navigate to clearpoint-interview folder

docker build -t clearpoint_interview_johnny .

docker run --rm clearpoint_interview_johnny <timestamp>

For example: docker run --rm clearpoint_interview_johnny 1145