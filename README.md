This is an empty REST-ful java using maven

Using the API
- http://localhost:8080/greeting
- http://localhost:8080/greeting?name=thai

e.g.: Response
```
{
  message: 'test',
  version: '1.0',
  buildNumber: '1'
}
```
Run Spring-Boot command:
```
mvn spring-boot:run -Dspring-boot.run.arguments=--buildNumber=1.0
./mvnw spring-boot:run -Dspring-boot.run.arguments=--buildNumber=1.0
```
Build project command: (useful)
```
mvn clean install
```
Run the jar file after build: (useful)
```
java -jar target/demo1_backend_java_1.0.jar --buildNumber=1.0
```
