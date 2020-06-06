FROM openjdk:8-jdk
EXPOSE 2015
RUN useradd -u 1005 -ms /bin/bash lakshmibijjala
ADD /target/hackathoncovid-0.0.1-SNAPSHOT.jar hackathoncovid-0.0.1-SNAPSHOT.jar
ADD /src/main/resources/application.properties application.properties 
RUN chown -R 1005:1005 hackathoncovid-0.0.1-SNAPSHOT.jar
RUN chmod 755 -R hackathoncovid-0.0.1-SNAPSHOT.jar
RUN chmod 755 -R application.properties 
RUN chown -R 1005:1005 application.properties 
USER 1005
CMD java -jar ./hackathoncovid-0.0.1-SNAPSHOT.jar --spring.config.location=./application.properties
