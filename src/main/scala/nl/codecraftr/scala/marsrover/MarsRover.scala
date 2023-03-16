package nl.codecraftr.scala.marsrover

case class MarsRover(x: Int, y: Int, orientation: Orientation) {
  def move(commands: List[Command]): MarsRover =
    commands.foldLeft(this)((rover, command) => rover.move(command))

  private def move(command: Command): MarsRover = command match {
    case Forward   => forward
    case Backwards => backward
    case TurnLeft  => left
  }

  private def forward: MarsRover = orientation match {
    case North => copy(y = y + 1)
    case South => copy(y = y - 1)
    case East  => copy(x = x + 1)
    case West  => copy(x = x - 1)
  }

  private def backward: MarsRover = orientation match {
    case North => copy(y = y - 1)
    case South => copy(y = y + 1)
    case East  => copy(x = x - 1)
    case West  => copy(x = x + 1)
  }

  private def left: MarsRover = orientation match {
    case North => copy(orientation = West)
    case South => copy(orientation = East)
    case East  => copy(orientation = North)
    case West  => copy(orientation = South)
  }
}
