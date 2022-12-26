package day6

import kotlin.streams.toList

class Day6 {

    companion object {
        fun signals(lines: List<String>, uniqueChars:Int): List<Int> {
            return lines.stream().map { line-> signalStart(line, uniqueChars) }.toList()
        }

        fun signalStart(source: String, uniqueChars: Int): Int {
            var x = 0;
            while (!unique(source.substring(x, x + uniqueChars))) {
                x++
            }
            return x + uniqueChars;
        }

        fun unique(source: String): Boolean {
            return source.toCharArray().toSet().size == source.length;
        }
    }
}

fun main(args: Array<String>) {
    val input = Day6::class.java.getResourceAsStream("/day6/input.txt")?.bufferedReader()?.readLines()
    println(Day6.signals(input!!, 4))
    println(Day6.signals(input, 14))
}