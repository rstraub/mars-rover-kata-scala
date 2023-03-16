package nl.codecraftr.scala.marsrover

object PositionParser {
  def parse(x: Int, y: Int, orientation: Char): MarsRover =
    MarsRover(x, y, parseOrientation(orientation))

  private def parseOrientation(orientation: Char) = {
    orientation match {
      case 'N' => North
      case 'E' => East
      case 'S' => South
      case 'W' => West
      case _ =>
        throw new IllegalArgumentException(
          s"Unsupported orientation '$orientation'"
        )
    }
  }
}
