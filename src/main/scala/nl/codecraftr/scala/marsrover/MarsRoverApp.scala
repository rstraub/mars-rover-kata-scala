package nl.codecraftr.scala.marsrover

object MarsRoverApp extends App {
  def move(x: Int, y: Int, orientation: Char, commands: String): String = {
    println(s"initial position: $x, $y, $orientation")
    println(s"commands: $commands")

    val initialRover = PositionParser.parse(x, y, orientation)
    val stoppedRover = initialRover.move(CommandParser.parseCommands(commands))

    s"final position: " +
      s"'x=${stoppedRover.coordinate.x.value}', " +
      s"'y=${stoppedRover.coordinate.y.value}', " +
      s"'o=${stoppedRover.orientation}'"
  }

  move(0, 0, 'N', "ffbllr")
}
