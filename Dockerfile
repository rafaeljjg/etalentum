FROM openjdk:11
COPY target/demo-unsplash-0.0.1-SNAPSHOT.jar demo-unsplash.jar
EXPOSE 8080
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar demo-unsplash.jar" ]
