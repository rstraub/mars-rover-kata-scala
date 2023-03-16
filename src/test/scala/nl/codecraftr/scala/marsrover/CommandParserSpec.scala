package nl.codecraftr.scala.marsrover

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CommandParserSpec extends AnyWordSpec with Matchers {
  "parse" should {
    "return 'Forward' given 'f's" in {
      CommandParser
        .parseCommands("ff") shouldBe List(MoveForward, MoveForward)
    }

    "return 'Backward' given 'b's" in {
      CommandParser
        .parseCommands("bb") shouldBe List(MoveBackwards, MoveBackwards)
    }

    "return 'TurnLeft' given 'l's" in {
      CommandParser
        .parseCommands("ll") shouldBe List(RotateLeft, RotateLeft)
    }

    "throw exception for other commands" in {
      val ex =
        the[IllegalArgumentException] thrownBy CommandParser.parseCommands(
          "xyz"
        )

      ex.getMessage shouldBe "Unsupported command 'x'"
    }
  }
}
