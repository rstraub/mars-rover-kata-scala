package nl.codecraftr.scala.marsrover

sealed trait Command

case object Forward extends Command
case object Backwards extends Command
