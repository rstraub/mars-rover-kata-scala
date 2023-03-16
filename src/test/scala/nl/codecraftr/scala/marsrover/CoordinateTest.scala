package nl.codecraftr.scala.marsrover

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class CoordinateTest extends AnyFlatSpec with Matchers {
  private val coordinate = Coordinate(X(0), Y(0))

  "incrementY" should "increase y coordinate by 1" in {
    coordinate.incrementY shouldBe Coordinate(X(0), Y(1))
  }

  "decrementY" should "lower y coordinate by 1" in {
    coordinate.decrementY shouldBe Coordinate(X(0), Y(-1))
  }

  "incrementX" should "increase x coordinate by 1" in {
    coordinate.incrementX shouldBe Coordinate(X(1), Y(0))
  }

  "decrementX" should "lower x coordinate by 1" in {
    coordinate.decrementX shouldBe Coordinate(X(-1), Y(0))
  }
}
