FROM openjdk:14
RUN mkdir /app
RUN mkdir /app/Portfolio2_Showtime/
RUN mkdir /app/Portfolio2_Showtime/src/
RUN mkdir /app/Portfolio2_Showtime/src/main/
RUN mkdir /app/Portfolio2_Showtime/src/main/resources/
ADD target/docker-spring-boot.jar /app
ADD target/classes/showtime2.p12 /app/Portfolio2_Showtime/src/main/resources/
EXPOSE 8080
WORKDIR /app
CMD java -jar docker-spring-boot.jar