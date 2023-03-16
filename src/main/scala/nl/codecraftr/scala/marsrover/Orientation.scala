package nl.codecraftr.scala.marsrover

sealed trait Orientation {
  def left: Orientation
}

case object North extends Orientation {
    override def left: Orientation = West
}

case object South extends Orientation {
    override def left: Orientation = East
}

case object East extends Orientation {
    override def left: Orientation = North
}

case object West extends Orientation {
    override def left: Orientation = South
}
