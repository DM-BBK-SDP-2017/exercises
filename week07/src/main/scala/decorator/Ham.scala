package decorator

class Ham(val pizza: Pizza) extends PizzaDecorator(pizza) {
  def getDesc: String = {
    pizza.getDesc + ", Ham (18.12)"
  }

  def getPrice: Double = {
    return pizza.getPrice + 18.12
  }
}
