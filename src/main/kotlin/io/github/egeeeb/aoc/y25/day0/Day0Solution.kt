package io.github.egeeeb.aoc.y25.day0

import io.github.egeeeb.aoc.Day
import io.github.egeeeb.aoc.y25.Solution25
import org.springframework.stereotype.Component

@Component
class Day0Solution: Solution25 {
    override fun solve(input: String): String {
        var counter = 0

        for (char in input) {
            if (char == '[') {counter ++}
        }

        return counter.toString()
    }

    override fun day(): Day {
        return Day.DAY0
    }
}