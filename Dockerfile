FROM openjdk:17
ADD ./docker-spring-bott.jar docker-spring-boot.jar

ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]