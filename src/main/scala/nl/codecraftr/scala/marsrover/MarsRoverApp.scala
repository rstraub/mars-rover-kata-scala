package nl.codecraftr.scala.marsrover

object MarsRoverApp extends App {
  def move(x: Int, y: Int, orientation: Char, commands: String): String = {
    println(s"initial position: $x, $y, $orientation")
    println(s"commands: $commands")

    println(s"parsed commands: ${CommandParser.parseCommands(commands)}")
    val rover = PositionParser.parse(x, y, orientation)
    s"final position: 'x=${rover.x}', 'y=${rover.y}', 'o=${rover.orientation}' "
  }

  move(0, 0, 'N', "ffbllr")
}
