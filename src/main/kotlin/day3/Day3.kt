package day3

class Day3 {

    val scores: String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    fun scoreRucksack(left: String, right: String): Int {
        val leftVals = HashSet<Char>();
        leftVals.addAll(left.toCharArray().asList())
        return right
            .toCharArray()
            .filter { r -> leftVals.contains(r) }
            .distinct()
            .map { v -> scores.indexOf(v) + 1 }
            .fold(0) { l, r -> l + r }
    }

    fun scoreRucksacks(sacks: List<String>): Int {
        return sacks
            .map { sack -> scoreRucksack(sack.substring(0, sack.length / 2), sack.substring(sack.length / 2)) }
            .fold(0) { l, r -> l + r }
    }

}

fun main(args: Array<String>) {
    val input = Day3::class.java.getResourceAsStream("/day3/input.txt")?.bufferedReader()?.readLines()
    println(Day3().scoreRucksacks(input ?: listOf("")))
}

