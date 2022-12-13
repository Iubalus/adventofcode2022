package day2

class Day2 {
    val lookup: HashMap<String, String> = HashMap();
    val playValue: HashMap<String, Int> = HashMap();
    val defeatLookup: HashMap<String, String> = HashMap();
    val victoryLookup: HashMap<String, String> = HashMap();

    init {
        lookup["X"] = "ROCK";
        lookup["A"] = "ROCK";
        lookup["Y"] = "PAPER";
        lookup["B"] = "PAPER";
        lookup["Z"] = "SCISSORS";
        lookup["C"] = "SCISSORS";
        playValue["ROCK"] = 1;
        playValue["PAPER"] = 2;
        playValue["SCISSORS"] = 3;
        defeatLookup["ROCK"] = "PAPER";
        defeatLookup["PAPER"] = "SCISSORS";
        defeatLookup["SCISSORS"] = "ROCK";
        victoryLookup["ROCK"] = "SCISSORS";
        victoryLookup["PAPER"] = "ROCK";
        victoryLookup["SCISSORS"] = "PAPER";
    }

    fun draw(left: String, right: String): Int {
        return if (left == right) 3 else 0
    }

    fun win(left: String, right: String): Int {
        return if (defeatLookup[left] == right) 6 else 0
    }

    fun scoreMatch(left: String, right: String): Int {
        return (playValue[right] ?: 0) + draw(left, right) + win(left, right);
    }

    fun specialLookup(left: String, right: String): String {
        if (right == "ROCK") {
            return victoryLookup[left] ?: "";
        }
        if(right == "SCISSORS"){
            return defeatLookup[left] ?: "";
        }
        return left;
    }

    fun rockPaperScissorsScore(lines: List<String>): Int {
        return lines
            .map { line -> line.split(" ") }
            .map { v -> scoreMatch(lookup[v[0]] ?: "", lookup[v[1]] ?: "") }
            .reduce { l, r -> l + r }
    }

    fun rockPaperScissorsPart2(lines: List<String>): Int {
        return lines
            .map { line -> line.split(" ") }
            .map { v -> scoreMatch(lookup[v[0]] ?: "", specialLookup(lookup[v[0]] ?: "", lookup[v[1]] ?: "")) }
            .reduce { l, r -> l + r }
    }

}

fun main(args: Array<String>) {
    val input = Day2::class.java.getResourceAsStream("/day2/input.txt")?.bufferedReader()?.readLines()
    println(Day2().rockPaperScissorsScore(input ?: listOf("")))
    println(Day2().rockPaperScissorsPart2(input ?: listOf("")))
}