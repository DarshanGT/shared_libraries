def gitStatus(String branch, String repoUrl){
    checkout([
        $class: 'GitSCM',
        branches: [[name: "*/${branch}"]],
        userRemoteConfigs: [[
            url: repoUrl,
            credentialsId: 'gitCred'
        ]]
    ])
    sh "mvn clean install"
    sh "cp -R webapp/target/webapp.war ."
} 
