
Cucumber (https://cucumber.io/) is testing framework for **Behavior-Driven Development** (BDD) style.
 
Cucumber has been written in **Ruby**, although implementations for other languages (including Java, JavaScript, and Python) are available.

Cucumber executes tests specified written in language called **Gherkin**

## Maven dependencies

```
  <dependency>
    <groupId>info.cukes</groupId>
    <artifactId>cucumber-junit</artifactId>
    <version>1.2.6</version>
    <type>pom</type>
    <scope>test</scope>
  </dependency>
```
## 1. Create Gherkin file .feature

## 2. Implement steps definition. 
    
Use annotation and regular expression to map the text contained in the Gherkin file to the test
    
## 3. Implement JUnit test

To achieve the integration of Cucumber and JUnit5, the Cucumber extension needs to be registered by @ExtendWith(CucumberExtension.class)
 
Internally, CucumberExtension implements the ParameterResolver callback of the Jupiter extension model. The objective is to inject the corresponding tests of the Cucumber feature as Jupiter DynamicTest objects in the tests. 

Optionally, we can annotate our test class with @CucumberOptions. This annotation allows to configure the Cucumber settings for our test. 


## The allowed elements for @CucumberOptions:
- plugin: Built-in formatter: pretty, progress, JSON, usage, among others. Default: {}.
- dryRun: Checks if all steps have definitions. Default: false.
- features: Paths of the features files. Default: {}.
- glue: Paths for step definitions. Default: {}.
- tags: Tags in the features to be executed. Default {}.
- monochrome: Displays console output in a readable way. Default: false.
- format: Reports formatter to be used. Default: {}.
- strict: Fails if there are undefined or pending steps. Default: false.”

    