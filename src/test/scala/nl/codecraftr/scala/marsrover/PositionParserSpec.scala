package nl.codecraftr.scala.marsrover

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class PositionParserSpec extends AnyWordSpec with Matchers {
  "parse" should {
    "return the rover with x and y coordinates" in {
      val result = PositionParser.parse(1, 2, 'N')

      result.x shouldBe 1
      result.y shouldBe 2
    }
  }
}
