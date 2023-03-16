package nl.codecraftr.scala.marsrover

case class MarsRover(coordinate: Coordinate, orientation: Orientation) {
  def move(commands: List[Command]): MarsRover =
    commands.foldLeft(this)((rover, command) => rover.move(command))

  private def move(command: Command) = command match {
    case MoveForward   => forward
    case MoveBackwards => backward
    case RotateLeft    => left
    case RotateRight   => right
  }

  private def forward = orientation match {
    case North => copy(coordinate = coordinate.incrementY)
    case South => copy(coordinate = coordinate.decrementY)
    case East  => copy(coordinate = coordinate.incrementX)
    case West  => copy(coordinate = coordinate.decrementX)
  }

  private def backward = orientation match {
    case North => copy(coordinate = coordinate.decrementY)
    case South => copy(coordinate = coordinate.incrementY)
    case East  => copy(coordinate = coordinate.decrementX)
    case West  => copy(coordinate = coordinate.incrementX)
  }

  private def left = copy(orientation = orientation.left)
  private def right = copy(orientation = orientation.right)
}
