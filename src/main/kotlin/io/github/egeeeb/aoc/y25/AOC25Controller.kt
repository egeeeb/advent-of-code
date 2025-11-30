package io.github.egeeeb.aoc.y25

import io.github.egeeeb.aoc.Day
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/aoc25")
class AOC25Controller(val solutions: List<Solution25>) {

    init {
        println("AOC25Controller")
    }

    @PostMapping("/{day}/solve")
    fun postSolve(@PathVariable day: Day, @RequestBody input: String): String {
        val solution = solutions.first { it.day() == day }
        return solution.solve(input)
    }
}