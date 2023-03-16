package nl.codecraftr.scala.marsrover

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class MarsRoverAppAcceptanceSpec
    extends AnyWordSpec
    with Matchers {

  "mars rover" should {
    "move to new position given series of commands" in {
      val result = MarsRoverApp.move(0, 0, 'N', "ffbrrlf")

      result shouldBe "x: '1', y: '1', o: 'N'"
    }
  }
}
