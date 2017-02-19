/**
  * Created by dannymadell on 19/02/2017.
  */
case class Person(first: String, second: String) {

}


object Person {

  def apply(fullName:String) : Person = {
    val names = fullName.split(" ")
    new Person(names(0), names(1))
  }
}