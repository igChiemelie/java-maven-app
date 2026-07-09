def buildApp(){
    echo 'building the application...'
    echo "building version ${NEW_VERSION}..."
}

def testApp(){
    echo 'testing the application...'
}

def buildApp(){
    echo 'deploying docker image...'
    echo "deploying version ${params.VERSION}..."
}
return this