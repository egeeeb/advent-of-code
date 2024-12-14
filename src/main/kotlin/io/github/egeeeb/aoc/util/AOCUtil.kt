package io.github.egeeeb.aoc.util

import java.io.File

class AOCUtil {
    companion object{
        fun fileToString(file: File): String {
            return file.readLines().joinToString(separator = "\n")
        }
        fun fileToListOfStrings(file: File): List<String>{
            return file.readLines()
        }
    }
}