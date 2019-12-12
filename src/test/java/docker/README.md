
## JUnit5-Docker
JUnit5-Docker is JUnit 5 extension for Docker (https://faustxvi.github.io/junit5-docker/). 
This extension acts as client of the Docker engine and allows to start a Docker container 
(downloaded from the Docker Hub), before running the tests of a class. 

That container is stopped at the end of the tests. 

## Maven Dependency

```
<dependency>
   <groupId>com.github.faustxvi</groupId>
   <artifactId>junit5-docker</artifactId>
   <version>${junit5-docker.version}</version>
   <scope>test</scope>
</dependency>
```