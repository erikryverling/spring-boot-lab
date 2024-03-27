package se.yverling.lab.springboot

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.query
import org.springframework.stereotype.Service
import se.yverling.lab.springboot.model.Coffee

@Service
class CoffeesService(val db: JdbcTemplate) {
    fun getAll(): List<Coffee> = db.query("select * from coffees") { response, _ ->
        Coffee(
            id = response.getString("id"),
            name = response.getString("name"),
            origin = response.getString("origin"),
            roaster = response.getString("roaster")
        )
    }

    fun getById(id: String): List<Coffee> = db.query("select * from coffees where id = ?", id) { response, _ ->
        Coffee(
            id = response.getString("id"),
            name = response.getString("name"),
            origin = response.getString("origin"),
            roaster = response.getString("roaster")
        )
    }

    fun save(coffee: Coffee) {
        val id = coffee.id
        db.update(
            "insert into coffees values ( ?, ?, ?, ? )",
            id, coffee.name, coffee.origin, coffee.roaster
        )
    }

    fun delete(id: String) = db.update("delete from coffees where id = ?", id)
}
