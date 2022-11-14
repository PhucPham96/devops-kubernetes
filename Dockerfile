FROM openjdk:11
EXPOSE 8080
ADD target/devops-kubernetes.jar devops-kubernetes.jar
ENTRYPOINT ["java", "-jar", "/devops-kubernetes.jar"]