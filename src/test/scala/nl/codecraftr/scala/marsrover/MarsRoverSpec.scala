package nl.codecraftr.scala.marsrover

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class MarsRoverSpec extends AnyWordSpec with Matchers {
  private val rover = MarsRover(0, 0, North)

  "move" when {
    "forward" should {
      "increase the y coordinate by 1 heading north" in {
        val result = rover.move(List(Forward))

        result.y shouldBe 1
      }

      "decrease the y coordinate by 1 heading south" in {
        val result =
          rover.copy(orientation = South).move(List(Forward))

        result.y shouldBe -1
      }

      "increase the x coordinate by 1 heading east" in {
        val result =
          rover.copy(orientation = East).move(List(Forward))

        result.x shouldBe 1
      }

      "decrease the x coordinate by 1 heading west" in {
        val result =
          rover.copy(orientation = West).move(List(Forward))

        result.x shouldBe -1
      }
    }
  }
}
