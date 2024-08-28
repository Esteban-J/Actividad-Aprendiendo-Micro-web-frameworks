package com.example.app

import org.scalatra._

class MyScalatraServlet extends ScalatraServlet {

  post("/users") {
    "POST => users => create"
  }

  get("/users/:id") {
    "GET => users => index"
  }

  patch("/users/:id") {
    "PATCH => users => update"
  }

  delete("/users/:id") {
    "DELETE => users => destroy"
  }
}
