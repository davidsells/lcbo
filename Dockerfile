FROM tomcat:jre8-alpine
COPY ./target/lcbo-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/lcbo.war
CMD ["catalina.sh", "run"]

