package nl.codecraftr.scala.marsrover

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpec

class CommandParserSpec extends AnyWordSpec with Matchers {
  "parse" should {
    "return 'Forward' given 'f's" in {
      CommandParser
        .parseCommands("ff") shouldBe List(Forward, Forward)
    }

    "return 'Backward' given 'b's" in {
      CommandParser
        .parseCommands("bb") shouldBe List(Backwards, Backwards)
    }

    "throw exception for other commands" in {
      val ex = the [IllegalArgumentException] thrownBy CommandParser.parseCommands("xyz")

      ex.getMessage shouldBe "Unsupported command 'x'"
    }
  }
}
