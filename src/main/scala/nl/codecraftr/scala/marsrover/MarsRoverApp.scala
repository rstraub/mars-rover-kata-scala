package nl.codecraftr.scala.marsrover

object MarsRoverApp extends App {
  def move(x: Int, y: Int, orientation: Char, commands: String): String = {
    println(s"position: $x, $y, $orientation")
    println(s"commands: $commands")

    ""
  }

  move(0, 0, 'N', "ffbllr")
}
