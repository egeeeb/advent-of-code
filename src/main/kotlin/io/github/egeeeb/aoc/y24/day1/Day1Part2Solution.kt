package io.github.egeeeb.aoc.y24.day1

import io.github.egeeeb.aoc.Day
import io.github.egeeeb.aoc.y24.Solution24
import org.springframework.stereotype.Component

@Component
class Day1Part2Solution : Solution24 {
    override fun day(): Day {
        return Day.DAY1_PART2
    }
    override fun solve(input: String): String {
        val pair = parse(input)
        val occurence = occurrence(pair.second)
        var total = 0
        pair.first.forEach {
            val count = occurence.getOrDefault(it, 0)
            total += count * it
        }

        return total.toString()
    }

    fun parse(input: String): Pair<List<Int>, List<Int>> {
        val firstList = mutableListOf<Int>()
        val secondList = mutableListOf<Int>()
        val listOfLines = input.lines()
        listOfLines.map { it.split("   ") }.forEach {
            firstList.add(it[0].toInt())
            secondList.add(it[1].toInt())
        }
        return Pair(firstList, secondList)
    }

    fun occurrence(list: List<Int>): Map<Int, Int>{
        val map = mutableMapOf<Int, Int>()
        list.forEach {
            val currentCount = map.getOrDefault(it, 0)
            map[it] = currentCount+1
        }

        return map
    }

}