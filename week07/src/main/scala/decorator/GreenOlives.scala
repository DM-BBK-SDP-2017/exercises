package decorator

class GreenOlives(val pizza: Pizza) extends PizzaDecorator(pizza) {
  def getDesc: String = {
    pizza.getDesc + ", Green Olives (5.47)"
  }

  def getPrice: Double = {
    return pizza.getPrice + 5.47
  }
}