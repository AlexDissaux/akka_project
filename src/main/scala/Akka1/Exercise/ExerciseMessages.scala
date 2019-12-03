package Akka1.Exercise

object ExerciseMessages {
  // Message is used to uppercase the txt and print it (locally)
  case class Message(text: String)

  // Print is used to print the text
  case class Print(text: String)

  // PrintMessage is used to uppercase the txt and
  // send the result to a PrintActor
  case class PrintMessage(text: String)

  case class PrintUpper(text: String)
}
