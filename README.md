# Actividad| Aprendiendo Micro web frameworks

This is an aplication exercise introductory to the creation of a micro web framework project. In this case we are using [scalatra](https://scalatra.org/) framework to deploy a [scala](https://www.scala-lang.org/) aplication.

## Getting Started

To get the source files of this project click on the next link to download them as a .zip file: 
[Download project)(https://github.com/Esteban-J/Actividad-Aprendiendo-Micro-web-frameworks/archive/refs/heads/main.zip]

### Prerequisites

* Bash CLI: This project uses bash commands. If you're not on a Unix-based operating system, you'll need to install a bash CLI. For Windows, you can use Git Bash or Windows Subsystem for Linux (WSL).

* Scala: Ensure Scala is installed on your machine. Follow the installation instructions on the [Scala website](https://www.scala-lang.org/).

* sbt: You'll need sbt (Simple Build Tool) to run the Scalatra project. Install sbt by following the instructions on the [sbt website](https://www.scala-sbt.org/).

## Running the Application

1. Extract the files from the downloaded .zip file into your project directory.

2. Open a bash terminal in your project directory.

3. Run the following command to start the server:

```
sbt ~Jetty/start
```
By default the server will be on http://localhost:8080

This application is a REST web application and supports various HTTP methods. You can test these methods using the following commands in a separate terminal:

```
curl -X POST http://localhost:8080/users
curl -X GET http://localhost:8080/users/1
curl -X PATCH http://localhost:8080/users/1
curl -X DELETE http://localhost:8080/users/1
```
Alternatively, you can use a tool like [Postman](https://www.postman.com/) to interact with the API.

## Built With

* [scalatra](https://scalatra.org/) - The web framework used
* [scala](https://www.scala-lang.org/)  - Programming language
* [sbt](https://www.scala-sbt.org/) - to buil the scala project

## Authors

* **Leonardo Ochoa Perez** -
* **Gerardo Esteban Jurado Carrera** - 

## Acknowledgments

* LUIS ANTONIO RAMIREZ MARTINEZ

