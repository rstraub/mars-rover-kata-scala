package nl.codecraftr.scala.marsrover

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class MarsRoverSpec extends AnyWordSpec with Matchers {
  private val rover = MarsRover(0, 0, North)

  "move" when {
    "forward" should {
      "increase the y coordinate by 1 heading north" in {
        val result = rover.move(List(Forward, Forward))

        result.y shouldBe 2
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

    "backwards" should {
      "decrease the y coordinate by 1 heading north" in {
        val result = rover.move(List(Backwards, Backwards))

        result.y shouldBe -2
      }

      "increase the y coordinate by 1 heading south" in {
        val result = rover.copy(orientation = South).move(List(Backwards))

        result.y shouldBe 1
      }

      "decrease the x coordinate by 1 heading east" in {
        val result = rover.copy(orientation = East).move(List(Backwards))

        result.x shouldBe -1
      }

      "increase the x coordinate by 1 heading west" in {
        val result = rover.copy(orientation = West).move(List(Backwards))

        result.x shouldBe 1
      }
    }

    "left" should {
      "change orientation to west given north" in {
        val result = rover.copy(orientation = North).move(List(TurnLeft))

        result.orientation shouldBe West
      }

      "change orientation to south given west" in {
        val result = rover.copy(orientation = West).move(List(TurnLeft))

        result.orientation shouldBe South
      }

      "change orientation to east given south" in {
          val result = rover.copy(orientation = South).move(List(TurnLeft))

          result.orientation shouldBe East
      }

      "change orientation to north given east" in {
          val result = rover.copy(orientation = East).move(List(TurnLeft))

          result.orientation shouldBe North
      }
    }
  }
}
