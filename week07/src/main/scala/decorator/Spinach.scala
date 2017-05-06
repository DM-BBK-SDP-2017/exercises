package decorator

class Spinach(val pizza: Pizza) extends PizzaDecorator(pizza) {
  def getDesc: String = {
    pizza.getDesc + ", Spinach (7.92)"
  }

  def getPrice: Double = {
    return pizza.getPrice + 7.92
  }
}