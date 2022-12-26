package day5

import java.util.stream.Collectors
import kotlin.streams.toList

class Day5 {

    companion object {

        fun moveBoxes(lines: List<String>): String {
            return moveBoxes(parseTowers(lines), parseCommands(lines))
        }

        private fun moveBoxes(towers: List<Tower>, commands: List<Command>): String {
            for (command in commands) {
                towers[command.towerTo].addTo(towers[command.towerFrom].takeFrom(command.numberOfBoxes))
            }
            return towers.stream().map { t -> t.topBox() }.collect(Collectors.joining());
        }

        fun parseTowers(lines: List<String>): List<Tower> {
            lines.stream().filter { l -> l.startsWith("[") }
            val towers: MutableList<Tower> = mutableListOf();
            for (line in lines) {
                if (line.contains("1")) {
                    break;
                }
                var towerInd = 0;
                var i = 1
                while (i < line.length) {
                    if (towers.size < towerInd + 1) {
                        towers.add(Tower())
                    }
                    val v = line[i].toString()
                    if (v != " ")
                        towers[towerInd].addTo(v)
                    towerInd++;
                    i += 4
                }
            }
            towers.forEach { t -> t.content = t.content.reversed() }
            return towers;
        }

        fun parseCommands(lines: List<String>): List<Command> {
            return lines.stream().filter { l -> l.contains("move") }.map { l -> Command(l) }.toList();
        }
    }

    class Tower {
        var content: String = "";

        fun takeFrom(boxes: Int): String {
            val taken = this.content.substring(this.content.length - boxes)
            this.content = this.content.substring(0, this.content.length - boxes)
            return taken.reversed();//commenting out the reversed solves part 2, but I didn't feel like wiring this feature through so I didn't
        }

        fun addTo(boxes: String) {
            this.content = this.content + boxes;
        }

        fun topBox(): String {
            return this.content.substring(this.content.length - 1)
        }
    }

    class Command(rawCommand: String) {
        val numberOfBoxes: Int;
        val towerFrom: Int;
        val towerTo: Int;

        init {
            val raw = rawCommand.split(" ");
            numberOfBoxes = raw[1].toInt();
            towerFrom = raw[3].toInt() - 1;
            towerTo = raw[5].toInt() - 1;
        }
    }
}

fun main(args: Array<String>) {
    val input = Day5::class.java.getResourceAsStream("/day5/input.txt")?.bufferedReader()?.readLines()
    println(Day5.moveBoxes(input!!))
}