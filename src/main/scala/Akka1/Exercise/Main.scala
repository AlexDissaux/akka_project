package Akka1.Exercise

import Akka1.Exercise.ExerciseMessages.Print
import akka.actor.{ActorSystem, Props}

object Main  extends App {
  //TODO 1.Create an actor system named Course1
  val system = ActorSystem("Course1")
  system.whenTerminated.onComplete({
    _ => System.exit(0)
  })

  //TODO 22.Change the way you create "print" actor. Use now RoundRobinPool(5).props(Props...). Run and look

  //TODO 3.Create an actor (of PrintActor) named "print"
  val print = system.actorOf(Props[PrintActor], "print")
  //TODO 4.Send "hello from print" to print using a Print message (next go to PrintActor)
  print ! Print("hello form print")


  //TODO 9.Create an actor (of UppercaseActor), name "uppercase"
  //TODO 10.Send "Hello from upper" to uppercase using a Message message
  //TODO 11.Send "hello from upper" to uppercase using a PrintMessage message (next go to UppercaseActor)

  //TODO 15.Create an actor (of PrintUppercaseActor) name "printUpper"
  //TODO 16.Send "hello from printupper" to printUpper using a PrintUpper message (next go to PrintUppercaseActor)

  //TODO 18.Create a Forwarder actor (with a ref to printUpper)
  //TODO 19.Send "hello from forwarderPrintUpper" using a Print message
  //TODO 20.Send "hello from forwarderPrintUpper" using a PrintUpper message (next go to Forwarder)


  println(s"${system.name} : Press Enter to quit")
  scala.io.StdIn.readLine()
  //TODO 2.Close correctly the system (and test to see if it is good)
  system.terminate()
}
