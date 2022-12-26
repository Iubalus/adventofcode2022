package day4

class Day4 {

    companion object {

        fun countPairs(lines: List<String>): Int {
            return lines
                .map { l -> l.split(",") }
                .count { v -> isContained(toPair(v[0]), toPair(v[1])) }
        }

        fun toPair(value: String): Pair<Int, Int> {
            val split = value.split("-")
            return Pair(split[0].toInt(), split[1].toInt());
        }

        fun isContained(left: Pair<Int, Int>, right: Pair<Int, Int>): Boolean {
            if (left.first <= right.first && left.second >= right.second) {
                return true;
            }
            if (right.first <= left.first && right.second >= left.second) {
                return true;
            }
            return false;
        }
    }

}

fun main(args: Array<String>) {
    val input = Day4::class.java.getResourceAsStream("/day4/input.txt")?.bufferedReader()?.readLines()
    println(Day4.countPairs(input ?: listOf("")))
}

