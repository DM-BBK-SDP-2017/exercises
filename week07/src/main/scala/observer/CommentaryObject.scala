package observer

// concrete subject

import scala.collection.mutable.ListBuffer

class CommentaryObject(var subscribers: ListBuffer[Observer], val title: String) extends Subject {

  def subscribeObserver(observer: Observer) = {subscribers.append(observer)}

  def unSubscribeObserver(observer: Observer) = {


      val ind = subscribers.indexOf(observer)
      if (ind != -1) {subscribers.remove(ind)}

  }

  def notifyObservers() = {for (s <- subscribers) {s.update("asd")}}

  def subjectDetails: String = "No idea what this method is for"
}
