package io.github.egeeeb.aoc

import io.github.egeeeb.aoc.util.AOCUtil
import java.io.File

interface Solution {
    fun day(): Day

    fun solve(input: String): String
    fun solve(file: File): String {
        return solve(AOCUtil.fileToString(file))
    }
}