package se.yverling.lab.springboot

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringBootLabApplication

fun main(args: Array<String>) {
    runApplication<SpringBootLabApplication>(*args)
}
