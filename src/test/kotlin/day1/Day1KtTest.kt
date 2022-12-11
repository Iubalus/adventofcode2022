package day1

import org.junit.Assert.*
import org.junit.Test

class Day1KtTest {

    @Test
    fun givenSingleElfCarryingNothing_expectZero() {
        checkResults("0", 0);
    }

    @Test
    fun givenSingleElfCarryingOneCalorieItem_expectCalorieItem() {
        checkResults("1000", 1000);
    }

    @Test
    fun givenSingleElfCarryingMultipleThings_expectSumOfCarriedCalories() {
        checkResults("1000" + System.lineSeparator() + "2000", 3000);
    }

    @Test
    fun givenMultipleElves_expectLargerElfPicked() {
        checkResults("1000" + System.lineSeparator() + System.lineSeparator() + "2000", 2000);
    }

    @Test
    fun givenMultipleElvesWithMultipleThings_expectLargerElfPicked() {
        checkResults("1000" + System.lineSeparator() + "2000" + System.lineSeparator() + System.lineSeparator() + "2000", 3000);
    }

    fun checkResults(input: String, expected: Int) {
        assertEquals(Day1().findHighestCalorieCountElf(input), expected);
    }
}
