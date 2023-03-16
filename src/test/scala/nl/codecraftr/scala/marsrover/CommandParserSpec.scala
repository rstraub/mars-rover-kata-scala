package nl.codecraftr.scala.marsrover

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CommandParserSpec extends AnyWordSpec with Matchers {
  "parse" should {
    "return forward given 'f's" in {
      CommandParser
        .parseCommands("ff") shouldBe List(MoveForward, MoveForward)
    }

    "return backward given 'b's" in {
      CommandParser
        .parseCommands("bb") shouldBe List(MoveBackwards, MoveBackwards)
    }

    "return left given 'l's" in {
      CommandParser
        .parseCommands("ll") shouldBe List(RotateLeft, RotateLeft)
    }

    "return right given 'r's" in {
      CommandParser
        .parseCommands("rr") shouldBe List(RotateRight, RotateRight)
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
