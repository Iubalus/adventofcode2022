package day2

import org.junit.Assert.*
import org.junit.Test

class Day2Test {

    @Test
    fun drawComputesForDrawsAppropriately() {
        assertEquals(Day2().draw("ROCK", "ROCK"), 3);
        assertEquals(Day2().draw("PAPER", "PAPER"), 3);
        assertEquals(Day2().draw("SCISSORS", "SCISSORS"), 3);
        assertEquals(Day2().draw("ROCK", "SCISSORS"), 0);
    }

    @Test
    fun winComputesAppropriately() {
        assertEquals(Day2().win("ROCK", "PAPER"), 6);
        assertEquals(Day2().win("PAPER", "SCISSORS"), 6);
        assertEquals(Day2().win("SCISSORS", "ROCK"), 6);
        assertEquals(Day2().win("ROCK", "ROCK"), 0);
    }

    @Test
    fun scoreMatch_computesForDraws() {
        assertEquals(Day2().scoreMatch("ROCK", "ROCK"), 4)
        assertEquals(Day2().scoreMatch("PAPER", "PAPER"), 5)
        assertEquals(Day2().scoreMatch("SCISSORS", "SCISSORS"), 6)
    }

    @Test
    fun scoreMatch_computesForWins() {
        assertEquals(Day2().scoreMatch("SCISSORS", "ROCK"), 7);
        assertEquals(Day2().scoreMatch("ROCK", "PAPER"), 8);
        assertEquals(Day2().scoreMatch("PAPER", "SCISSORS"), 9);
    }

    @Test
    fun scoreMatch_computesForLosses() {
        assertEquals(Day2().scoreMatch("PAPER", "ROCK"), 1);
        assertEquals(Day2().scoreMatch("SCISSORS", "PAPER"), 2);
        assertEquals(Day2().scoreMatch("ROCK", "SCISSORS"), 3);
    }

    @Test
    fun integration_rawInputCanBeScoredAndSums() {
        assertEquals(Day2().rockPaperScissorsScore(listOf("A X")), 4)
        assertEquals(Day2().rockPaperScissorsScore(listOf("B Y")), 5)
        assertEquals(Day2().rockPaperScissorsScore(listOf("C Z")), 6)
        assertEquals(Day2().rockPaperScissorsScore(listOf("C X")), 7);
        assertEquals(Day2().rockPaperScissorsScore(listOf("A Y")), 8);
        assertEquals(Day2().rockPaperScissorsScore(listOf("B Z")), 9);
        assertEquals(Day2().rockPaperScissorsScore(listOf("B X")), 1);
        assertEquals(Day2().rockPaperScissorsScore(listOf("C Y")), 2);
        assertEquals(Day2().rockPaperScissorsScore(listOf("A Z")), 3);
    }

    @Test
    fun specialLookup_whenIPlayRock_IMustLose() {
        assertEquals(Day2().specialLookup("ROCK", "ROCK"), "SCISSORS");
        assertEquals(Day2().specialLookup("PAPER", "ROCK"), "ROCK");
        assertEquals(Day2().specialLookup("SCISSORS", "ROCK"), "PAPER");
    }

    @Test
    fun specialLookup_whenIPlayPaper_IMustDraw() {
        assertEquals(Day2().specialLookup("ROCK", "PAPER"), "ROCK");
        assertEquals(Day2().specialLookup("PAPER", "PAPER"), "PAPER");
        assertEquals(Day2().specialLookup("SCISSORS", "PAPER"), "SCISSORS");
    }

    @Test
    fun specialLookup_whenIPlayScissors_IMustWin() {
        assertEquals(Day2().specialLookup("ROCK", "SCISSORS"), "PAPER");
        assertEquals(Day2().specialLookup("PAPER", "SCISSORS"), "SCISSORS");
        assertEquals(Day2().specialLookup("SCISSORS", "SCISSORS"), "ROCK");
    }

    @Test
    fun integration_sumsWithRawInput() {
        assertEquals(Day2().rockPaperScissorsScore(listOf("A X", "A X")), 8)
    }
}