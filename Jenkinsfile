pipeline {
    agent any
    tools {
       maven 'Maven 3.8.1'
        jdk 'JDK 17.0.11'
    }
    environment {
        SONAR_URL = 'http://sonarqube:9000'
        NEXUS_URL = 'http://nexus:8081'
        NEXUS_CREDENTIALS = credentials('nexus-credentials')
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh 'mvn sonar:sonar'
            }
                timeout(time: 1, unit: 'HOURS') {
                    waitForQualityGate abortPipeline: true
        }
        }
            }
        stage('Upload to Nexus') {
            steps {
                sh """
                    mvn deploy \
                    -DrepositoryId=nexus \
                    -Durl=${NEXUS_URL}/repository/maven-releases \
                    -DskipTests
                """
        }
    }
        stage('Run Tests') {
            steps {
                sh 'mvn test'
                junit '**/target/surefire-reports/*.xml'
}
        }
        stage('Deploy with Ansible') {
            steps {
                ansiblePlaybook(
                    playbook: 'deploy.yml',
                    inventory: 'inventory/hosts',
                    credentialsId: 'ansible-credentials',
                    extras: '-e "version=${BUILD_NUMBER}"'
                )
            }
        }
    }
    post {
        always {
            cleanWs()
        }
        success {
            echo 'Pipeline succeeded!'
        }
        failure {
            echo 'Pipeline failed!'
        }
    }
}
