package io.github.egeeeb.aoc.util

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest
import java.io.File


@SpringBootTest
class AOCUtilTest{

    @Test
    fun `AOCUtil fileToString should return a String of File given`(){
        val file = File("src/test/resources/input_example.txt")
        val string = AOCUtil.fileToString(file)
        val expected = """
            HELLO
            WORLD
            HELLO!
        """.trimIndent()
        assertEquals(expected, string)
    }

    @Test
    fun `AOCUtil fileToListOfStrings should return a List of Strings from File given`(){
        val file = File("src/test/resources/input_example.txt")
        val strings = AOCUtil.fileToListOfStrings(file)
        val expectedList = listOf(
                "HELLO", "WORLD", "HELLO!"
        )
        assertEquals(expectedList, strings)
    }
}