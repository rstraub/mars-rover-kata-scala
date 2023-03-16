package nl.codecraftr.scala.marsrover

object CommandParser {
  def parseCommands(commands: String): List[Command] = commands
    .split("")
    .map(parseCommand)
    .toList

  private def parseCommand(command: String): Command = command match {
    case "b" => MoveBackwards
    case "f" => MoveForward
    case "l" => RotateLeft
    case _ =>
      throw new IllegalArgumentException(s"Unsupported command '$command'")
  }
}
