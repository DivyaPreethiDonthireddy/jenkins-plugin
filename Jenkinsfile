pipeline{
    agent any

    stages{
         stage ('Compile Stage')
         {
         steps{
           withMaven(maven:'MAVEN-HOME'){
              bat 'mvn clean compile'
           }
         }
      }
         stage ('Testing Stage')
         {
         steps{
            withMaven(maven:'MAVEN-HOME'){
                bat 'mvn test'
             }
         }
         }
         stage ('Deployment Stage')
         {
         steps{
             withMaven(maven:'MAVEN-HOME'){
                bat 'mvn deploy'
             }
         }
         }
    }
}