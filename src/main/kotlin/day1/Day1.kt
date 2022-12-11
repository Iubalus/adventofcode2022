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

}

fun main(args: Array<String>) {
    val input = Day1::class.java.getResourceAsStream("/day1/input.txt")?.bufferedReader()?.readText()
    print(Day1().findHighestCalorieCountElf(input ?: "-1"));
}