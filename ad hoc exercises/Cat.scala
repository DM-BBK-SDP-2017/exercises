/**
  * Created by dannymadell on 02/02/2017.
  */


object Cat {

  case class Cat (var colour :String, var FavouriteFood :String ) {

    def eat (food :String) = food match {
      case Cat(_, f) if food == f => println("nomnom")
      case _ => println("bleurgh")
    }
  }


  def main(args: Array[String]): Unit = {
    var Oswald = Cat("Black", "Milk");
    val Henderson = Cat("Ginger and White", "Chips");
    val Quentin = Cat("Tabby and whitex", "Curry");
    Oswald.colour = "asd";
    Oswald.FavouriteFood = "asd";
  }


}
