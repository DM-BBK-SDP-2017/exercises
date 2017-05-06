package decorator

class Cheese(val pizza: Pizza) extends PizzaDecorator(pizza) {
  def getDesc: String = {
    pizza.getDesc + ", Cheese (20.72)"
  }

  def getPrice: Double = {
    return pizza.getPrice + 20.72
  }
}
