def call(string url, string branch){
  echo "cloning stage"
  git url: "${url}", branch: "${branch}"
  echo " code is cloned"
}
