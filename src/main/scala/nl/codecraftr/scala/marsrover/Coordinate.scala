package nl.codecraftr.scala.marsrover

case class Coordinate(x: Int, y: Int) {
  def incrementY: Coordinate = copy(y = y + 1)
  def decrementY: Coordinate = copy(y = y - 1)
  def incrementX: Coordinate = copy(x = x + 1)
  def decrementX: Coordinate = copy(x = x - 1)
}
