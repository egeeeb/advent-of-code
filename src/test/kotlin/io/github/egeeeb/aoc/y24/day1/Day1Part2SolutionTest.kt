package io.github.egeeeb.aoc.y24.day1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.io.File

@SpringBootTest
class Day1Part2SolutionTest {

    @Autowired
    lateinit var day1Part2Solution: Day1Part2Solution

    @Test
    fun `solve should give 31 given the example input`(){
        val example: String = """
            3   4
            4   3
            2   5
            1   3
            3   9
            3   3
        """.trimIndent()

        val solution = day1Part2Solution.solve(example)

        kotlin.test.assertEquals("31", solution)
    }

    @Test
    fun `solve should give ? given the example input file`(){
        val solution = day1Part2Solution.solve(File("src/test/resources/day1/input"))

        kotlin.test.assertEquals("22565391", solution)
    }
}