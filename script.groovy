def buildApp() {
	sh "docker-compose build web"
}

def testApp() {
	echo 'testing the applications...'
}

def deployApp() {
	sh "docker-compose up -d"
}
return this