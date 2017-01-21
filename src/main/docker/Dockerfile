FROM java:8
VOLUME /tmp
COPY target/coreapi-aws-1.0.0-SNAPSHOT.jar containercoreapi.jar
EXPOSE 8080
RUN bash -c 'touch /containercoreapi.jar'
ENTRYPOINT ["java","-jar","/containercoreapi.jar"]
