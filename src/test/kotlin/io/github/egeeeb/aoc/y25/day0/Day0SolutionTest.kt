package io.github.egeeeb.aoc.y25.day0

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.junit.jupiter.api.Test
import java.io.File
import kotlin.test.assertEquals

@SpringBootTest
class Day0SolutionTest {
    @Autowired
    lateinit var day0Solution: Day0Solution

    @Test
    fun `solve should return 30 given example input`() {
        val example = """
            f[h2Xy@jK0qG8m4aPz3t1r[Lw9sD
            Ubn[eC5gR7[v[M6iJpA[xO[fYTdZ
            AQc[E[S8o[Wl[hNkY1z[pT4r[gD
            tI9J[sBvG[f[3R[5ePq7cM0[X[L
            W[4[h2[x3a[z[k7[T[b[u[v[e[
        """.trimIndent()

        val solution = day0Solution.solve(example)

        assertEquals("30", solution)
    }

    @Test
    fun `should give 202 given the input file`() {
        val solution = day0Solution.solve(file = File("src/test/resources/y25/day0-input.txt"))

        assertEquals("202", solution)
    }

}