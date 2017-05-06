package decorator

class SimplyNonVegPizza extends Pizza {

  def getDesc: String = {
    "Simply Non Veg Pizza (350)"
  }

  def getPrice: Double = {
    350
  }
}
