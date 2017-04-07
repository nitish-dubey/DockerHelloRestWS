FROM frolvlad/alpine-oraclejdk8:slim
 
EXPOSE 8080
 
 #install Spring Boot artifact
VOLUME /tmp
ADD target/HelloWebService-0.0.1-SNAPSHOT.jar myapp.jar
RUN sh -c 'touch /sfg-thymeleaf-course.jar'
ENV JAVA_OPTS=""
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/myapp.jar"]