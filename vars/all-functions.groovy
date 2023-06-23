
 def call(String namespace,boolean project){
            stages {
                stage('check') {
                    steps {
                        echo "checking your code"
                        echo "${namespace}"
                    
                    }
                }

                stage('test') {
                    when {
                        expression{
                            project == true 
                        }
                    }
                    steps {
                        echo "testing your app" 
                    }
                }
                
                stage('deployment') {  
                    steps {
                        echo "your code is deployed right now"
                        echo "this build number $BUILD_NUMBER"
                    }
                }    
            }

        }
       