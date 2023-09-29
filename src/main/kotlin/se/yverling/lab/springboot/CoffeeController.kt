package se.yverling.lab.springboot

import org.springframework.web.bind.annotation.*

@RestController
class CoffeeController(val service: CoffeeService) {
    @GetMapping("/coffee")
    fun getAll(): List<Coffee> = service.getAll()

    @GetMapping("/coffee/{id}")
    fun getById(@PathVariable id: String): List<Coffee> =
        service.getById(id)

    @PostMapping("/coffee")
    fun save(@RequestBody message: Coffee) {
        service.save(message)
    }

    @DeleteMapping("/coffee/{id}")
    fun delete(@PathVariable id: String) {
        service.delete(id)
    }
}