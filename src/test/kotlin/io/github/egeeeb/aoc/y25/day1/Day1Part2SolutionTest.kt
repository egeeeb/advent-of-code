package io.github.egeeeb.aoc.y25.day1

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.io.File
import kotlin.test.assertEquals

@SpringBootTest
class Day1Part2SolutionTest {

    @Autowired
    lateinit var day1Part2Solution: Day1Part2Solution

    @Test
    fun `solve should give 11 given the example input`(){
        val example: String = """
            L68
            L30
            R48
            L5
            R60
            L55
            L1
            L99
            R14
            L82
        """.trimIndent()

        val solution = day1Part2Solution.solve(example)

        assertEquals("6", solution)
    }

    @Test
    fun `solve should give 1111 given the example input`(){
        val example: String = """
            R250
        """.trimIndent()

        val solution = day1Part2Solution.solve(example)

        assertEquals("7", solution)
    }

    @Test
    fun `should give 6689 given the input file`() {
        val solution = day1Part2Solution.solve(file = File("src/test/resources/y25/day1-input.txt"))

        assertEquals("6689", solution)
    }
}