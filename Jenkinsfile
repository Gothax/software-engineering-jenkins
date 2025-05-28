pipeline{
    agent any

    options {
        skipStagesAfterUnstable()
    }

    environment {
    	    GITHUB_CREDENTIALS = 'GITHUB'
    }

    stages {
        stage('Git Clone') {
                steps {
                    git branch: 'main', credentialsId: "${GITHUB_CREDENTIALS}",
                    url: 'https://github.com/Gothax/software-engineering-jenkins.git'
                    }
                }

                stage('Build') {
                    steps {
                        script {
                            echo 'chmod'
                            sh 'chmod +x ./gradlew'

                            echo 'clean build'
                            sh './gradlew clean build -x test'
                        }

                    }
                }
            }
    }


}