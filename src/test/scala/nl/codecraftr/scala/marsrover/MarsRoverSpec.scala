package nl.codecraftr.scala.marsrover

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class MarsRoverSpec extends AnyWordSpec with Matchers {
  private val rover = MarsRover(0, 0, North)

  "move" when {
    "forward" should {
      "increase the y coordinate by 1 heading north" in {
        val result = rover.move(List(MoveForward, MoveForward))

        result.y shouldBe 2
      }

      "decrease the y coordinate by 1 heading south" in {
        val result =
          rover.copy(orientation = South).move(List(MoveForward))

        result.y shouldBe -1
      }

      "increase the x coordinate by 1 heading east" in {
        val result =
          rover.copy(orientation = East).move(List(MoveForward))

        result.x shouldBe 1
      }

      "decrease the x coordinate by 1 heading west" in {
        val result =
          rover.copy(orientation = West).move(List(MoveForward))

        result.x shouldBe -1
      }

    }

    "backwards" should {
      "decrease the y coordinate by 1 heading north" in {
        val result = rover.move(List(MoveBackwards, MoveBackwards))

        result.y shouldBe -2
      }

      "increase the y coordinate by 1 heading south" in {
        val result = rover.copy(orientation = South).move(List(MoveBackwards))

        result.y shouldBe 1
      }

      "decrease the x coordinate by 1 heading east" in {
        val result = rover.copy(orientation = East).move(List(MoveBackwards))

        result.x shouldBe -1
      }

      "increase the x coordinate by 1 heading west" in {
        val result = rover.copy(orientation = West).move(List(MoveBackwards))

        result.x shouldBe 1
      }
    }

    "left" should {
      "change orientation to west given north" in {
        val result = rover.copy(orientation = North).move(List(RotateLeft))

        result.orientation shouldBe West
      }

      "change orientation to south given west" in {
        val result = rover.copy(orientation = West).move(List(RotateLeft))

        result.orientation shouldBe South
      }

      "change orientation to east given south" in {
          val result = rover.copy(orientation = South).move(List(RotateLeft))

          result.orientation shouldBe East
      }

      "change orientation to north given east" in {
          val result = rover.copy(orientation = East).move(List(RotateLeft))

          result.orientation shouldBe North
      }
    }
  }
}
