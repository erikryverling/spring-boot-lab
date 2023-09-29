package se.yverling.lab.springboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import java.util.*

@SpringBootApplication
class SpringBootLabApplication

fun main(args: Array<String>) {
    runApplication<SpringBootLabApplication>(*args)
}

data class Coffee(val id: String = UUID.randomUUID().toString(), val name: String, val roaster: String, val origin: String)