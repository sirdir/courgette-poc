#!groovy

pipeline {
    agent any
    stages {
        stage('gradle') {
            parallel {

                stage('gradle 1') {
                    steps{
                        script {
                            def dockerfile = 'Dockerfile1'
                            test_gradle_1 = docker.build("test-1", "-f ${dockerfile} .")
                            test_gradle_1.inside {
                                sh "./gradlew executeFeatures --rerun-tasks --no-daemon"
                            }
                        }
                    }
                }
                stage('gradle 2') {
                    steps{
                        script {
                            def dockerfile = 'Dockerfile2'
                            test_gradle_2 = docker.build("test-2", "-f ${dockerfile} .")
                            test_gradle_2.inside {
                                sh "./gradlew executeFeatures --rerun-tasks --no-daemon"
                            }
                        }
                    }
                }
            }
        }


    }
}