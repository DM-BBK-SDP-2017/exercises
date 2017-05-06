package observer

/**
  * Created by dannymadell on 05/03/2017.
  */
class SMSUsersObserver(commentaryObjectObservable: CommentaryObjectObservable, str: String) extends Observer {

  def update(desc: String) = {
    println(desc)
  }

  def subscribe() = commentaryObjectObservable.subscribeObserver(this)

  def unSubscribe() = commentaryObjectObservable.unSubscribeObserver(this)
}
