package observer

import scala.collection.mutable.ListBuffer

/**
  * Created by dannymadell on 04/03/2017.
  */
class CommentaryObjectObservable(var subscribers: ListBuffer[Observer], val title: String) extends Commentary with Subject {

  def this(str: String) = {
    this(new ListBuffer[Observer], str)
  }
  var descs: ListBuffer[String] = new ListBuffer[String]

  override def setDesc(desc: String): Unit = {
    descs prepend desc
    notifyObservers()

  }

  //def getDesc() = {descs.head}
  def subscribeObserver(observer: Observer) = {subscribers.append(observer)}

  def unSubscribeObserver(observer: Observer) = {


    val ind = subscribers.indexOf(observer)
    if (ind != -1) {subscribers.remove(ind)}

  }

  def notifyObservers() = {for (s <- subscribers) {s.update(descs.head)}}

  def subjectDetails: String = "No idea what this method is for"
}
