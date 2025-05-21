pipeline {
    agent any
    triggers {
        // GitHub webhook trigger
        githubPush()
    }
    stages {
        stage('Checkout') {
            steps {
                // Clone from SCM (requires a Jenkinsfile in the repo root)
                checkout scm
            }
        }
        stage('Build') {
            steps {
                // Clean and build without running tests
                sh './gradlew clean build -x test'
            }
        }
        stage('Test') {
            steps {
                // Run tests
                sh './gradlew test'
            }
            post {
                always {
                    // Publish JUnit test results
                    junit '**/build/test-results/**/*.xml'
                }
            }
        }
    }
    post {
        success {
            echo '✅ Build and tests succeeded!'
        }
        failure {
            echo '❌ Build or tests failed.'
        }
        always {
            // Archive build artifacts (optional)
            archiveArtifacts artifacts: '**/build/libs/*.jar', onlyIfSuccessful: true
        }
    }
}
