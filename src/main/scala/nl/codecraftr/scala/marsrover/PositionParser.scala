package nl.codecraftr.scala.marsrover

object PositionParser {
    def parse(x: Int, y: Int, orientation: Char): MarsRover  = {
      MarsRover(x, y)
    }
}
