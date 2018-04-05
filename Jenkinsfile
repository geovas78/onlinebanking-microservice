// Variables we want to define with a script{} block should be declared outside the pipeline
def startdate = "UNKNOWN"

pipeline {
    // Default tools to install on agent
    tools {
        jdk 'jdk1.8.0-162'
        gradle 'Gradle-4.6'
    }
    
    stages {
        stage('Build') {
            steps {
                // Run build on platforms in parallel
                parallel (
                    // Run on default agent
                    "linux": {
                        gitlabCommitStatus(name: 'Build') {
                            sh "gradle clean"
                            sh "gradle -i"
                        }
                    }
                )
            }
        }
    }
}
