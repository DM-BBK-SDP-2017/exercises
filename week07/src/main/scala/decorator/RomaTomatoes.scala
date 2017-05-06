package decorator

class RomaTomatoes(val pizza: Pizza) extends PizzaDecorator(pizza) {

  def getDesc: String = {
    pizza.getDesc + ", Roma Tomatoes (5.20)"
  }

  def getPrice: Double = {
    return pizza.getPrice + 5.20
  }
}