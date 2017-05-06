package decorator

/**
  * Created by dannymadell on 05/03/2017.
  */
abstract class PizzaDecorator(pizza: Pizza) extends Pizza {

  def getDesc: String

  def getPrice: Double

}
