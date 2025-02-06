FROM openjdk:17
ADD target/utec_proyecto_fin_ghactions.jar utec_proyecto_fin_ghactions.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","utec_proyecto_fin_ghactionss.jar"]