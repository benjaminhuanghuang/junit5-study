


## Maven plugin for Junit 
```   
    <build>
       <plugins>
           <plugin>
               <groupId>org.apache.maven.plugins</groupId>
               <artifactId>maven-surefire-plugin</artifactId>
               <version>${maven-surefire-plugin.version}</version>
           </plugin>
       </plugins>
   </build>
```

maven-surefire-plugin是个什么鬼

如果你执行过mvn test或者执行其他maven命令时跑了测试用例，你就已经用过maven-surefire-plugin了。
maven-surefire-plugin是maven里执行测试用例的插件，不显示配置就会用默认配置。
这个插件的surefire:test命令会默认绑定maven执行的test阶段。