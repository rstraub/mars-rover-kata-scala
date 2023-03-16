package nl.codecraftr.scala.marsrover

case class X(value: Int) extends AnyVal {
  def increment: X = copy(value = value + 1)
  def decrement: X = copy(value = value - 1)
}

case class Y(value: Int) extends AnyVal {
  def increment: Y = copy(value = value + 1)
  def decrement: Y = copy(value = value - 1)
}

case class Coordinate(x: X, y: Y) {
  def incrementY: Coordinate = copy(y = y.increment)
  def decrementY: Coordinate = copy(y = y.decrement)
  def incrementX: Coordinate = copy(x = x.increment)
  def decrementX: Coordinate = copy(x = x.decrement)
}
