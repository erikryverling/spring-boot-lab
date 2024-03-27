package se.yverling.lab.springboot

import org.springframework.web.bind.annotation.*
import se.yverling.lab.springboot.model.Coffee

@RestController
class CoffeeController(val service: CoffeesService) {
    @GetMapping("/coffees")
    fun getAll(): List<Coffee> = service.getAll()

    @GetMapping("/coffees/{id}")
    fun getById(@PathVariable id: String): List<Coffee> =
        service.getById(id)

    @PostMapping("/coffees")
    fun save(@RequestBody message: Coffee) {
        service.save(message)
    }

    @DeleteMapping("/coffees/{id}")
    fun delete(@PathVariable id: String) {
        service.delete(id)
    }
}