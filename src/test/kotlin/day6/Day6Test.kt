package day6

import org.junit.Assert.*
import org.junit.Test

class Day6Test {

    @Test
    fun canFindSignalInStream() {
        assertEquals(5, Day6.signalStart("bvwbjplbgvbhsrlpgdmjqwftvncz"))
        assertEquals(6, Day6.signalStart("nppdvjthqldpwncqszvftbrmjlhg"))
        assertEquals(10, Day6.signalStart("nznrnfrfntjfmvfwmzdfjlvtqnbhcprsg"))
        assertEquals(11, Day6.signalStart("zcfzfwzzqfrljwzlrfnpqdbhtmscgvjw"))
    }

    @Test
    fun testUnique() {
        assertTrue(Day6.unique("ABCD"))
        assertTrue(Day6.unique("D"))
        assertTrue(Day6.unique("DB"))

        assertFalse(Day6.unique("ABCA"))
        assertFalse(Day6.unique("AA"))
    }
}