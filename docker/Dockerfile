FROM java:8
MAINTAINER Richard Santana
ADD *.jar /app.jar
RUN sh -c 'touch /app.jar'
ADD wait-for-it/wait-for-it.sh /wait-for-it.sh
RUN sh -c 'chmod +x /wait-for-it.sh'
EXPOSE 8080