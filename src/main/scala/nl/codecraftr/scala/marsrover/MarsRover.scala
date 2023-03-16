package nl.codecraftr.scala.marsrover

case class MarsRover(x: Int, y: Int, orientation: Orientation) {
  def move(commands: List[Command]): MarsRover =
    commands.foldLeft(this)((rover, command) => rover.move(command))

  private def move(command: Command): MarsRover = command match {
    case MoveForward   => forward
    case MoveBackwards => backward
    case RotateLeft    => left
    case RotateRight   => right
  }

  private def forward = orientation match {
    case North => copy(y = y + 1)
    case South => copy(y = y - 1)
    case East  => copy(x = x + 1)
    case West  => copy(x = x - 1)
  }

  private def backward = orientation match {
    case North => copy(y = y - 1)
    case South => copy(y = y + 1)
    case East  => copy(x = x - 1)
    case West  => copy(x = x + 1)
  }

  private def left = copy(orientation = orientation.left)

  private def right = orientation match {
    case North => copy(orientation = East)
    case South => copy(orientation = West)
    case East  => copy(orientation = South)
    case West  => copy(orientation = North)
  }
}
