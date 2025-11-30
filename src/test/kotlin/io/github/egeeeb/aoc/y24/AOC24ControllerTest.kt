package io.github.egeeeb.aoc.y24

import io.github.egeeeb.aoc.Day
import org.junit.jupiter.api.Test
import org.mockito.Mockito
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.bean.override.mockito.MockitoBean
import java.util.UUID
import kotlin.test.assertEquals

@SpringBootTest
@AutoConfigureMockMvc
class AOC24ControllerTest{

    @Autowired
    lateinit var aoC24Controller: AOC24Controller

    @MockitoBean
    @Qualifier("test1")
    lateinit var solutionTest1: Solution24

    @MockitoBean
    @Qualifier("test2")
    lateinit var solutionTest2: Solution24

    @Test
    fun `postSolve should invoke correct Solution with given day`() {
        val expected = UUID.randomUUID().toString()
        val input = UUID.randomUUID().toString()

        Mockito.`when`(solutionTest1.day()).thenReturn(Day.TEST1)
        Mockito.`when`(solutionTest2.day()).thenReturn(Day.TEST2)
        Mockito.`when`(solutionTest1.solve(input)).thenReturn(expected)

        val result = aoC24Controller.postSolve(Day.TEST1, input)

        assertEquals(expected, result)
    }
}