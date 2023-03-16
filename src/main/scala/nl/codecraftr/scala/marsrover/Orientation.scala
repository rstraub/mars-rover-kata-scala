package nl.codecraftr.scala.marsrover

sealed trait Orientation {
  def left: Orientation
  def right: Orientation
}

case object North extends Orientation {
  override def left: Orientation = West
  override def right: Orientation = East
}

case object South extends Orientation {
  override def left: Orientation = East
  override def right: Orientation = West
}

case object East extends Orientation {
  override def left: Orientation = North
  override def right: Orientation = South
}

case object West extends Orientation {
  override def left: Orientation = South
  override def right: Orientation = North
}
