package nl.codecraftr.scala.marsrover

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class MarsRoverAppAcceptanceSpec extends AnyWordSpec with Matchers {

  "mars rover" should {
    /*
     * (0,0,N) -> (0,1,N) -> (0,2,N) -> (0,1,N)
     */
    "move forward and backwards" in {
      val result = MarsRoverApp.move(0, 0, 'N', "ffb")

      result shouldBe "final position: 'x=0', 'y=1', 'o=North'"
    }
  }
}
