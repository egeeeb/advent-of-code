package io.github.egeeeb.aoc.y25.day1

import io.github.egeeeb.aoc.Day
import io.github.egeeeb.aoc.y25.Solution25
import org.springframework.stereotype.Component

@Component
class Day1Part2Solution: Solution25 {
    override fun solve(input: String): String {
        val startPoint = 50
        val listOfCommands = input.lines()
        var currentPoint = startPoint
        var distance: Int
        var counter = 0
        for (command in listOfCommands) {
            distance = command.substring(startIndex = 1).toInt()
            if (command[0] == 'L') {
                currentPoint -= distance
                if (-1 * distance == currentPoint ) { counter-- }

                while (currentPoint <= 0) {
                    counter++
                    if(currentPoint != 0) { currentPoint += 100 } else { break }
                }
            } else {
                currentPoint += distance
                while (currentPoint > 99) {
                    currentPoint-=100
                    counter++
                }
            }
        }

        return counter.toString()
    }

    override fun day(): Day {
        return Day.DAY1_PART2
    }
}