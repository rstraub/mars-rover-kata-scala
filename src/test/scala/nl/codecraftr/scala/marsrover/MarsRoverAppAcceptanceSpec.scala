package nl.codecraftr.scala.marsrover

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class MarsRoverAppAcceptanceSpec extends AnyWordSpec with Matchers {

  "mars rover" should {
    /*
     * (0,0,N) -> (0,1,N) -> (0,2,N)
     */
    "move forwards" in {
      val result = MarsRoverApp.move(0, 0, 'N', "ff")

      result shouldBe "final position: 'x=0', 'y=2', 'o=North'"
    }

    /*
     * (0,3,N) -> (0,2,N) -> (0,1,N)
     */
    "move backwards" in {
      val result = MarsRoverApp.move(0, 3, 'N', "bb")

      result shouldBe "final position: 'x=0', 'y=1', 'o=North'"
    }
  }
}
