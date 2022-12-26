package day4

import org.junit.Assert.*
import org.junit.Test

class Day4Test {

    @Test
    fun canParsePair() {
        assertEquals(Pair(1, 2), Day4.toPair("1-2"))
        assertEquals(Pair(0, 0), Day4.toPair("0-0"))
        assertEquals(Pair(10, 25), Day4.toPair("10-25"))
    }

    @Test
    fun testContained() {
        assertFalse(Day4.isContained(Pair(0, 0), Pair(1, 1)))
        assertFalse(Day4.isContained(Pair(1, 1), Pair(0, 0)))
        assertFalse(Day4.isContained(Pair(0, 1), Pair(1, 2)))
        assertFalse(Day4.isContained(Pair(1, 2), Pair(0, 1)))

        assertTrue(Day4.isContained(Pair(0, 0), Pair(0, 0)))
        assertTrue(Day4.isContained(Pair(0, 5), Pair(2, 3)))
        assertTrue(Day4.isContained(Pair(2, 3), Pair(0, 5)))
    }

    @Test
    fun integration() {
        assertEquals(
            2,
            Day4.countPairs(
                listOf(
                    "2-4,6-8",
                    "2-3,4-5",
                    "5-7,7-9",
                    "2-8,3-7",
                    "6-6,4-6",
                    "2-6,4-8"
                )
            )
        )
    }
}