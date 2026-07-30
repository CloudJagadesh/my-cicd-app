# my-cicd-app

Sample Java (Spring Boot) app for the GitHub + Jenkins + SonarQube + Docker pipeline.

## What it does
A tiny web app with two endpoints:
- `/` — returns a hello message
- `/health` — returns "OK"

## How to use this with the setup guide

1. Unzip this folder.
2. Open `Jenkinsfile` and replace `<your-username>` in the `git url` with your actual GitHub username/repo.
3. Push it to your own GitHub repo:
   ```bash
   cd my-cicd-app
   git init
   git add .
   git commit -m "initial commit"
   git branch -M main
   git remote add origin https://github.com/<your-username>/my-cicd-app.git
   git push -u origin main
   ```
4. Follow the setup guide from Part 9 onward (create the Jenkins pipeline job and webhook).

## Run it locally (optional, to test before pushing)
```bash
mvn clean package
java -jar target/myapp.jar
```
Then visit `http://localhost:8080`.
