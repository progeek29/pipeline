FROM openjdk:8
EXPOSE 8080
ADD target/cicd-workflow-image.jar cicd-workflow-image.jar
ENTRYPOINT ["java","-jar","/cicd-workflow-image.jar"]