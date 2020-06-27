node{
    stage('git Checkout') {
    git 'https://github.com/deepskyer/devops'
    }

    stage('Compile Package') {
        sh 'mvn package'
    }
}