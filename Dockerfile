FROM openjdk:11
EXPOSE 8080
ADD target/devops-kubernetes-0.0.1-SNAPSHOT.jar devops-kubernetes-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "/devops-kubernetes-0.0.1-SNAPSHOT.jar"]