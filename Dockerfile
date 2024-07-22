FROM openjdk:17

EXPOSE 8083

ADD target/springboot-mysql-docker.jar springboot-mysql-docker.jar

ENTRYPOINT ["java","-jar","/springboot-mysql-docker.jar"]

#if we are not getting any jar file in target folder then in pom.xml file we need to type <finalName>file-name</finalName> after </plugins>