FROM openjdk:17
EXPOSE 8080
ADD target/movie-2.7.5.jar movie.jar
ENTRYPOINT ["java","-jar","/movie.jar"]