package com.toomanycalendars.plugins

import io.ktor.server.routing.*
import io.ktor.server.response.*
import io.ktor.server.webjars.*
import io.ktor.http.*
import io.ktor.server.application.*

fun Application.configureRouting() {
    install(Webjars) {
        path = "/webjars" //defaults to /webjars
    }
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        get("/webjars") {
            call.respondText("<script src='/webjars/jquery/jquery.js'></script>", ContentType.Text.Html)
        }
    }
}
