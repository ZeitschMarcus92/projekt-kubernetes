pipeline {
    agent any
    stages {
        stage('Build Docker Images') {
            steps {
                sh 'docker build -t todo-backend:dev ./backend'
                sh 'docker build -t todo-frontend:dev ./frontend'
            }
        }
    }
}


