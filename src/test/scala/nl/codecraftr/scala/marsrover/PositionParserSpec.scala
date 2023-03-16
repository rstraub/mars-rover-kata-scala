package nl.codecraftr.scala.marsrover

import org.scalatest.matchers.should.Matchers
import org.scalatest.prop.TableDrivenPropertyChecks
import org.scalatest.wordspec.AnyWordSpec

class PositionParserSpec
    extends AnyWordSpec
    with Matchers
    with TableDrivenPropertyChecks {
  "parse" should {
    "return the rover with x and y coordinates" in {
      val result = PositionParser.parse(1, 2, 'N')

      result.x shouldBe 1
      result.y shouldBe 2
    }

    "return the rover with orientation" in {
      val orientations = Table(
        ("input", "orientation"),
        ('N', North),
        ('E', East),
        ('S', South),
        ('W', West)
      )

      forAll(orientations) { (input, expected) =>
        val result = PositionParser.parse(0, 0, input)

        result.orientation shouldBe expected
      }
    }

    "throw an exception given other orientation" in {
      val ex = the[IllegalArgumentException] thrownBy PositionParser
        .parse(0, 0, 'X')

      ex.getMessage shouldBe "Unsupported orientation 'X'"
    }
  }
}
