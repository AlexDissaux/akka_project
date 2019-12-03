package Akka1.Exercise

import Akka1.Exercise.ExerciseMessages.Print
import akka.actor.{Actor, ActorLogging}

//TODO 5. PrintActor is an Actor
case class PrintActor() extends Actor with ActorLogging{
  //TODO 6.Implements method for receiving an Print message
  //TODO 7.print also ${context.self} to know who is printing
  //TODO 8.Run to see (to continue go to Main)
  override def receive: Receive = {
    case Print(msg) => println(s"${context.self} : $msg")
  }
}
