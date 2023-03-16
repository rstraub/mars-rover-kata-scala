package nl.codecraftr.scala.marsrover

case class MarsRover(x: Int, y: Int, orientation: Orientation) {
  def move(commands: List[Command]): MarsRover = {
    var rover = this

    commands.foreach(command => {
      rover = rover.forward
    })

    rover
  }

  private def forward: MarsRover = orientation match {
    case North => copy(y = y + 1)
    case South => copy(y = y - 1)
    case East  => copy(x = x + 1)
    case West  => copy(x = x - 1)
  }
}
