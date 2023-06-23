def call(boolean project ) {
   when {
            expression{
                project == true 
                }
            }
            steps {
                echo "testing your app" 
            }
}