package io.github.egeeeb.aoc.y24

import io.github.egeeeb.aoc.y24.day1.Day1Solution
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/aoc24")
class AOC24Controller(val solutions: List<Solution>) {

    init {
        println("AOC24Controller")
    }

    @PostMapping("/{day}/solve")
    fun postSolve(@PathVariable day: Day, @RequestBody input: String): String {
        val solution = solutions.first { it.day() == day }
        return solution.solve("")
    }
}