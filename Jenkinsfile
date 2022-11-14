pipeline {
    agent any
    tools{
        maven 'maven-3.8.6'
    }
    stages{
        stage('Checkout GIT'){
            steps{
                checkout([$class: 'GitSCM', branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[credentialsId: '983c77e5-a561-4293-8c1e-52e864cec43f', url: 'https://github.com/PhucPham96/devops-kubernetes.git']]])
            }
        }
        stage('Build Maven'){
            steps{
                sh 'mvn clean install'
            }
        }
        stage('Build docker image'){
            steps{
                script{
                    sh 'docker build -t phucpham9xx/devops-kubernetes .'
                }
            }
        }
        stage("Docker login") {
            steps {
                sh 'docker login -u phucpham9xx -p Nokia12345@@'
            }
        }
        stage("Docker push") {
            steps {
//                 sh 'docker tag devops-kubernetes phucpham9xx/devops-kubernetes'
                sh 'docker push phucpham9xx/devops-kubernetes:latest'
            }
        }
    }
}
