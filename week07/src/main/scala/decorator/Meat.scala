package decorator

class Meat(val pizza: Pizza) extends PizzaDecorator(pizza) {
  def getDesc: String = {
    pizza.getDesc + ", Meat (14.25)"
  }

  def getPrice: Double = {
    return pizza.getPrice + 14.25
  }
}