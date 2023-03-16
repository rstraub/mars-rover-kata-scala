package nl.codecraftr.scala.marsrover

case class MarsRover(x: Int, y: Int, orientation: Orientation) {
  def move(commands: List[Command]): MarsRover = {
    var rover = this

    commands.foreach(command => {
      rover = orientation match {
        case North => rover.copy(y = rover.y + 1)
        case South => rover.copy(y = rover.y - 1)
        case East  => rover.copy(x = rover.x + 1)
        case West  => rover.copy(x = rover.x - 1)
      }
    })

    rover
  }
}
