package day5

import org.junit.Assert.*
import org.junit.Test

class Day5Test {

    @Test
    fun integrationTest_Tower() {
        val tower = Day5.Tower()
        tower.addTo("ABCD")
        assertEquals("D", tower.topBox())
        assertEquals("DC", tower.takeFrom(2))
        assertEquals("B", tower.topBox())
        tower.addTo("FG")
        assertEquals("G", tower.topBox())
    }

    @Test
    fun commandParsesCorrectly() {
        val c = Day5.Command("move 6 from 2 to 1")
        assertEquals(6, c.numberOfBoxes)
        assertEquals(1, c.towerFrom)//adjusted for indexing
        assertEquals(0, c.towerTo)
    }

    @Test
    fun canParseTowers() {
        val towers = Day5.parseTowers(
            listOf(
                "[N]         [C]     [Z]            ",
                "[Q] [G]     [V]     [S]         [V]",
                "[L] [C]     [M]     [T]     [W] [L]",
                "[S] [H]     [L]     [C] [D] [H] [S]",
                "[C] [V] [F] [D]     [D] [B] [Q] [F]",
                "[Z] [T] [Z] [T] [C] [J] [G] [S] [Q]",
                "[P] [P] [C] [W] [W] [F] [W] [J] [C]",
                "[T] [L] [D] [G] [P] [P] [V] [N] [R]",
                " 1   2   3   4   5   6   7   8   9 ",
                "",
                "move 1 from 2 to 3"
            )
        )
        assertEquals(9, towers.size)
        assertEquals("TPZCSLQN", towers[0].content)
        assertEquals("LPTVHCG", towers[1].content)
        assertEquals("DCZF", towers[2].content)
        assertEquals("GWTDLMVC", towers[3].content)
        assertEquals("PWC", towers[4].content)
        assertEquals("PFJDCTSZ", towers[5].content)
        assertEquals("VWGBD", towers[6].content)
        assertEquals("NJSQHW", towers[7].content)
        assertEquals("RCQFSLV", towers[8].content)
    }

    @Test
    fun canParseCommands() {
        val commands = Day5.parseCommands(
            listOf(
                "[N]         [C]     [Z]            ",
                "[Q] [G]     [V]     [S]         [V]",
                "[L] [C]     [M]     [T]     [W] [L]",
                "[S] [H]     [L]     [C] [D] [H] [S]",
                "[C] [V] [F] [D]     [D] [B] [Q] [F]",
                "[Z] [T] [Z] [T] [C] [J] [G] [S] [Q]",
                "[P] [P] [C] [W] [W] [F] [W] [J] [C]",
                "[T] [L] [D] [G] [P] [P] [V] [N] [R]",
                " 1   2   3   4   5   6   7   8   9 ",
                "",
                "move 1 from 2 to 3"
            )
        )
        assertEquals(1, commands.size)
        assertEquals(1, commands[0].numberOfBoxes)
        assertEquals(1, commands[0].towerFrom)
        assertEquals(2, commands[0].towerTo)
    }

    @Test
    fun integrationTest() {
        val topBoxes = Day5.moveBoxes(
            listOf(
                "[C] [F] [I]",
                "[B] [E] [H]",
                "[A] [D] [G]",
                " 1   2   3 ",
                "",
                "move 1 from 1 to 2",
                "move 2 from 2 to 3"
            )
        )
        assertEquals("BEF", topBoxes)
    }
}