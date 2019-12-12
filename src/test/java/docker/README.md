
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
## The elements available in @Docker annotation
- image: Docker image to be started.
- ports: Port mapping for the Docker container. This is required since at least one port must be visible for the container to be useful.
- environments: Optional environment variables to pass to the docker container. Default: {}.
- waitFor: Optional log to wait for before running the tests. Default: @WaitFor(NOTHING).
- newForEachCase: Boolean flag, which determines if the container should be recreated for each test case. This value will be false if it should be created only once for the test class. Default: true.”

