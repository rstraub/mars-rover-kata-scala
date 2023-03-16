package nl.codecraftr.scala.marsrover

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class MarsRoverAppAcceptanceSpec extends AnyWordSpec with Matchers {
  "mars rover" should {
    "move forwards" in {
      val result = MarsRoverApp.move(0, 0, 'N', "ff")

      result shouldBe "final position: 'x=0', 'y=2', 'o=North'"
    }

    "move backwards" in {
      val result = MarsRoverApp.move(0, 3, 'N', "bb")

      result shouldBe "final position: 'x=0', 'y=1', 'o=North'"
    }

    "rotate left" in {
      val result = MarsRoverApp.move(0, 0, 'N', "ll")

      result shouldBe "final position: 'x=0', 'y=0', 'o=South'"
    }
  }
}
