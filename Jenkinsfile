node{
    stage('git clone') {
    git 'https://github.com/deepskyer/devops'
    }

    stage('Compile Package') {
        bat 'mvn clean install'
    }

    stage('Build image') {
        app = docker.build("bingms/devops")
    }

    stage('Push image'){
           docker.withRegistry('https://registry.hub.docker.com', 'docker-hub') {
            app.push("${env.BUILD_NUMBER}")
            app.push("latest")
           }
            echo 'Pushed image to docker hub'
    }

    stage('Deploy to k8s'){
            sh "./changeTag.sh $env.BUILD_NUMBER"
            script{
                try{
                    sh "kubectl apply -f ./update/"
                } catch(error) {
                    sh "kubectl create -f ./update/"
                }
            }
    }
}
