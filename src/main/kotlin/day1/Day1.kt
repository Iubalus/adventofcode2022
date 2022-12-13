package day1

class Day1 {

    fun findHighestCalorieCountElf(input: String): Int {
        val sep = System.lineSeparator()
        return input
            .split(sep + sep)
            .map { i ->
                i
                    .split(sep)
                    .map { v -> v.toInt() }
                    .reduce { l, r -> l + r }
            }
            .max();
    }

    fun findTop3HighestCalorieCountElf(input: String): Int {
        val sep = System.lineSeparator()
        return input
            .split(sep + sep)
            .map { i ->
                i
                    .split(sep)
                    .map { v -> v.toInt() }
                    .reduce { l, r -> l + r }
            }
            .sortedDescending()
            .subList(0, 3)
            .reduce({ l, r -> l + r });
    }

}

fun main(args: Array<String>) {
    val input = Day1::class.java.getResourceAsStream("/day1/input.txt")?.bufferedReader()?.readText()
    println(Day1().findHighestCalorieCountElf(input ?: "-1"));
    println(Day1().findTop3HighestCalorieCountElf(input ?: "-1"));
}