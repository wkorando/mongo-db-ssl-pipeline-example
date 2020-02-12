FROM adoptopenjdk/openjdk8-openj9:alpine-slim

COPY mongodb.crt /

RUN keytool -importcert -trustcacerts -file mongodb.crt -keystore dbcert -noprompt -storepass changeit

COPY target/mongo-db-ssl-pipeline-example.jar /

ENTRYPOINT ["java", "-Djavax.net.ssl.keyStorePassword=changeit","-Djavax.net.ssl.trustStore=dbcert", "-jar", "mongo-db-ssl-pipeline-example.jar" ]