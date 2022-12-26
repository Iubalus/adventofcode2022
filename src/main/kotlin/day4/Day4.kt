package day4

class Day4 {

    companion object {

        fun countPairs(lines: List<String>, criteria: (left: Pair<Int, Int>, right: Pair<Int, Int>) -> Boolean): Int {
            return lines
                .map { l -> l.split(",") }
                .count { v -> criteria(toPair(v[0]), toPair(v[1])) }
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

        private fun rangeContains(range: Pair<Int, Int>, point: Int):Boolean{
            return point >= range.first && point <= range.second;
        }

        fun anyOverlap(left: Pair<Int, Int>, right: Pair<Int, Int>): Boolean {
            if (rangeContains(right, left.first) || rangeContains(right, left.second)) {
                return true;
            }
            if (rangeContains(left, right.first) || rangeContains(left, right.second)) {
                return true;
            }
            return false;
        }
    }

}

fun main(args: Array<String>) {
    val input = Day4::class.java.getResourceAsStream("/day4/input.txt")?.bufferedReader()?.readLines()
    println(Day4.countPairs(input ?: listOf(""), Day4::isContained))
    println(Day4.countPairs(input ?: listOf(""), Day4::anyOverlap))
}

