node{
    stage('git Checkout') {
    git 'https://github.com/deepskyer/devops'
    }

    stage('Compile Package') {
        def mvnHome = tool name: 'maven3', type: 'maven'
        bat "${mvnHome}/bin/mvn package"
    }
}