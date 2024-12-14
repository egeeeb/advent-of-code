package io.github.egeeeb.aoc.y24.day1

import io.github.egeeeb.aoc.y24.Day
import io.github.egeeeb.aoc.y24.Solution
import org.springframework.stereotype.Component
import kotlin.math.absoluteValue

@Component
class Day1Solution : Solution {
    override fun solve(input: String): String {
        val lists = parse(input)
        val sortedLists = sortedLists(lists)
        return distance(sortedLists).toString()
    }

    fun parse(input: String): PairOfList {
        val firstList = mutableListOf<Int>()
        val secondList = mutableListOf<Int>()
        val listOfLines = input.lines()
        listOfLines.map { it.split("   ") }.forEach {
            firstList.add(it[0].toInt())
            secondList.add(it[1].toInt())
        }

        return PairOfList(firstList, secondList)
    }

    fun sortedLists(pairOfList: PairOfList): PairOfList = PairOfList(pairOfList.first.sorted(), pairOfList.second.sorted())

    fun distance(pairOfList: PairOfList): Int {
        var sum = 0
        val firstList = pairOfList.first
        val secondList = pairOfList.second
        for (i in firstList.indices) {
            val difference = (firstList[i] - secondList[i]).absoluteValue
            sum += difference
        }
        return sum
    }

    data class PairOfList(val first: List<Int>, val second: List<Int>)

    override fun day(): Day {
        return Day.DAY1
    }
}