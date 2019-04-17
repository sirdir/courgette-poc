#!groovy

pipeline {
    agent any
    stages {
        stage('gradle') {
            parallel {
                stage('gradle 1') {
                    steps{
                        sh "./gradlew executeFeatures"
                    }
                }
                stage('gradle 2') {
                    steps{
                        sh "./gradlew executeFeatures"
                    }
                }
            }
        }


    }
}