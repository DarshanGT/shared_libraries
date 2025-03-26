def docker_push(user,pass,image,repo){
  sh "docker login -u ${user} -p ${pass}"
  sh "docker pull ${image}"
  sh "docker tag ${image} ${repo}/${image}"
  sh "docker push ${repo}/${image}"
}
def mavenci(branch,git_url) {
  git branch: "${branch}", url: "${git_url}"
}
