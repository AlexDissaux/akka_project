package Akka1.Exercise

import akka.actor.{Actor, ActorRef}

case class Forwarder(to : ActorRef) extends Actor {
  //TODO 21.Implements receive method. This method should redirect any Message receive to the
  // actor refence as ${to}. Run to see (then go back to Main)
  override def receive = ???
}
