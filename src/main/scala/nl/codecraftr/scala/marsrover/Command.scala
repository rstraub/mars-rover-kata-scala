package nl.codecraftr.scala.marsrover

sealed trait Command

case object MoveForward extends Command
case object MoveBackwards extends Command
case object RotateLeft extends Command
case object RotateRight extends Command
