package io.github.egeeeb.aoc.y24.day1

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import java.io.File
import kotlin.test.assertEquals


@SpringBootTest
class Day1Part1SolutionTest{

    @Autowired
    lateinit var day1Part1Solution: Day1Part1Solution

    @Test
    fun `solve should give 11 given the example input`(){
        val example: String = """
            3   4
            4   3
            2   5
            1   3
            3   9
            3   3
        """.trimIndent()

        val solution = day1Part1Solution.solve(example)

        assertEquals("11", solution)
    }

    @Test
    fun `solve should give 3574690 given the example input file`(){
        val solution = day1Part1Solution.solve(File("src/test/resources/day1/input"))

        assertEquals("3574690", solution)
    }
}