node{
    stage('git clone') {
    git 'https://github.com/deepskyer/devops'
    }

    stage('Compile Package') {
        bat 'mvn clean install'
    }

    stage('Build image') {
        app = docker.build("bingms/devops:win -f docker-windows/Dockerfile .")
    }

    stage('Test image') {
        app.inside {
            echo 'Tests passed'
        }
    }

    stage('Push image'){
           docker.withRegistry('https://registry.hub.docker.com', 'docker-hub') {
            app.push("${env.BUILD_NUMBER}")
            app.push("latest")
           }
            echo 'Trying to push image to docker hub'
    }
}