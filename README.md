# Flight Club Management App

## Introduction

Welcome, this is our greatest and most complex team project at our programming school Codecool. It consisted of six weeks of sprints and included various Java technologies.
The program is a flight club management application which offers managing of airplanes and reservations for small airports and hobby pilot clubs.
It is still heavily work-in-progress and most probably it won't be fully finished due to the team being broken up.
Please always keep in mind that many features are not yet working as intended. Only use the development branch to clone the repository.
**Warning, do not share any confidential information with the app, please use dummy data for checking out the user registration features.**
Please follow the installation guide to be able to initiate a web server and see the application's features. Only for personal and educational purpose.
*This Readme file is a temporary one as a new one with full installation process coverage is being made.*

## Prerequisites, technologies

Technologies used in this project:
- frontend: HTML, CSS, SCSS (grid, flex), React.JS, MaterialUI
- NodeJS for frontend server
- backend: Java Spring Framework (Spring Boot, Spring Web, Spring Data, Spring Security)
- Spring Web tools for backend server and endpoints
- Spring Boot Test for unit tests
- database: PostgreSQL, H2
- Maven dependency manager
- SwaggerUI for testing endpoints and requests
- Postman for testing sending requests
- Docker for CD/CI pipeline
- GitHub Workflow for workflows and roadmap

## How to run

Please install all necessary frameworks and external programs to be able to run the app server. Java JDK 17 or newer version is required.

1. Open the project repo as a Maven project with an IDE of your choice (IntelliJ IDEA is recommended)
2. Install the necessary prerequisites with a help tool
3. Compile and execute ManagementApplication Java file
4. Open a browser of your choice and navigate to localhost:8080
5. You may use SwaggerUI or Postman to check out the endpoints such as /club or /user
6. Use npm install then npm start to start the NodeJS server to be able to see the frontend part of the app
7. Go to localhost:5000 with a browser of your choice
8. Now you can see the application in it's full glory, enjoy! :)

Please always bear in mind that the application is in early phase and may work unintendedly and you may experience crashes or visual bugs as well as unresponsiveness.
**Do not** use actual personal data for login process. We do not take any responsibility for accidental data leakage as the program is still in development.
