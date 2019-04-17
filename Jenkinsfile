#!groovy

pipeline {
    agent any
    stages {
        stage('gradle') {
            parallel {
                stage('gradle 1') {
                    steps{
                        sh "gradle executeFeatures"
                    }
                }
                stage('gradle 2') {
                    steps{
                        sh "gradle executeFeatures"
                    }
                }
            }
        }


    }
}