FROM alpine:3.5

WORKDIR /src
COPY . /src

RUN apk --no-cache add openjdk8 maven
ENV PATH "$PATH:/usr/lib/jvm/java-1.8-openjdk/bin"
RUN mvn clean install

EXPOSE 8080

CMD ["java", "-jar", "/src/target/HelloWebService-0.0.1-SNAPSHOT.jar"]
