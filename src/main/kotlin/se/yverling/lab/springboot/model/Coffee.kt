package se.yverling.lab.springboot.model

import java.util.*

data class Coffee(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val roaster: String,
    val origin: String
)
