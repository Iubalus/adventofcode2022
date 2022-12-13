package day3

import org.junit.Assert.*
import org.junit.Test

class Day3Test {

    @Test
    fun givenMismatchedValues_expectNoScore() {
        assertEquals(0, Day3().scoreRucksack("a", "b"))
    }

    @Test
    fun givenSeparateRucksacks_expectScoreCalculated() {
        assertEquals(1, Day3().scoreRucksack("cat", "bag"))
        assertEquals(30, Day3().scoreRucksack("door", "boom"))
    }

    @Test
    fun givenBaseMatchingValues_expectBasicResults() {
        assertEquals(1, Day3().scoreRucksack("a", "a"))
        assertEquals(2, Day3().scoreRucksack("b", "b"))
        assertEquals(3, Day3().scoreRucksack("c", "c"))
        assertEquals(4, Day3().scoreRucksack("d", "d"))
        assertEquals(5, Day3().scoreRucksack("e", "e"))
        assertEquals(6, Day3().scoreRucksack("f", "f"))
        assertEquals(7, Day3().scoreRucksack("g", "g"))
        assertEquals(8, Day3().scoreRucksack("h", "h"))
        assertEquals(9, Day3().scoreRucksack("i", "i"))
        assertEquals(10, Day3().scoreRucksack("j", "j"))
        assertEquals(11, Day3().scoreRucksack("k", "k"))
        assertEquals(12, Day3().scoreRucksack("l", "l"))
        assertEquals(13, Day3().scoreRucksack("m", "m"))
        assertEquals(14, Day3().scoreRucksack("n", "n"))
        assertEquals(15, Day3().scoreRucksack("o", "o"))
        assertEquals(16, Day3().scoreRucksack("p", "p"))
        assertEquals(17, Day3().scoreRucksack("q", "q"))
        assertEquals(18, Day3().scoreRucksack("r", "r"))
        assertEquals(19, Day3().scoreRucksack("s", "s"))
        assertEquals(20, Day3().scoreRucksack("t", "t"))
        assertEquals(21, Day3().scoreRucksack("u", "u"))
        assertEquals(22, Day3().scoreRucksack("v", "v"))
        assertEquals(23, Day3().scoreRucksack("w", "w"))
        assertEquals(24, Day3().scoreRucksack("x", "x"))
        assertEquals(25, Day3().scoreRucksack("y", "y"))
        assertEquals(26, Day3().scoreRucksack("z", "z"))
        assertEquals(27, Day3().scoreRucksack("A", "A"))
        assertEquals(28, Day3().scoreRucksack("B", "B"))
        assertEquals(29, Day3().scoreRucksack("C", "C"))
        assertEquals(30, Day3().scoreRucksack("D", "D"))
        assertEquals(31, Day3().scoreRucksack("E", "E"))
        assertEquals(32, Day3().scoreRucksack("F", "F"))
        assertEquals(33, Day3().scoreRucksack("G", "G"))
        assertEquals(34, Day3().scoreRucksack("H", "H"))
        assertEquals(35, Day3().scoreRucksack("I", "I"))
        assertEquals(36, Day3().scoreRucksack("J", "J"))
        assertEquals(37, Day3().scoreRucksack("K", "K"))
        assertEquals(38, Day3().scoreRucksack("L", "L"))
        assertEquals(39, Day3().scoreRucksack("M", "M"))
        assertEquals(40, Day3().scoreRucksack("N", "N"))
        assertEquals(41, Day3().scoreRucksack("O", "O"))
        assertEquals(42, Day3().scoreRucksack("P", "P"))
        assertEquals(43, Day3().scoreRucksack("Q", "Q"))
        assertEquals(44, Day3().scoreRucksack("R", "R"))
        assertEquals(45, Day3().scoreRucksack("S", "S"))
        assertEquals(46, Day3().scoreRucksack("T", "T"))
        assertEquals(47, Day3().scoreRucksack("U", "U"))
        assertEquals(48, Day3().scoreRucksack("V", "V"))
        assertEquals(49, Day3().scoreRucksack("W", "W"))
        assertEquals(50, Day3().scoreRucksack("X", "X"))
        assertEquals(51, Day3().scoreRucksack("Y", "Y"))
        assertEquals(52, Day3().scoreRucksack("Z", "Z"))
    }

    @Test
    fun givenRawRucksacks_computeScoreAppropriately() {
        assertEquals(16, Day3().scoreRucksacks(listOf("batrag", "foodgoal")))
    }

    @Test
    fun integration_givenExamples() {
        assertEquals(16, Day3().scoreRucksacks(listOf("vJrwpWtwJgWrhcsFMMfFFhFp")))
        assertEquals(38, Day3().scoreRucksacks(listOf("jqHRNqRjqzjGDLGLrsFMfFZSrLrFZsSL")))
        assertEquals(42, Day3().scoreRucksacks(listOf("PmmdzqPrVvPwwTWBwg")))
        assertEquals(22, Day3().scoreRucksacks(listOf("wMqvLMZHhHMvwLHjbvcjnnSBnvTQFn")))
        assertEquals(20, Day3().scoreRucksacks(listOf("ttgJtRGJQctTZtZT")))
        assertEquals(19, Day3().scoreRucksacks(listOf("CrZsJsPPZsGzwwsLwLmpwMDw")))
    }
}