package io.github.egeeeb.aoc.y24

import io.github.egeeeb.aoc.util.AOCUtil
import org.springframework.stereotype.Component
import java.io.File

@Component
interface Solution {
    fun day():Day

    fun solve(input: String):String
    fun solve(file: File):String {
        return solve(AOCUtil.fileToString(file))
    }
}