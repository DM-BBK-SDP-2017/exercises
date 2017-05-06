package factory

/**
  * Created by dannymadell on 24/02/2017.
  * ConcreteCreator overrides the factory method to return an instance of a ConcreteProduct
  */
class ConcreteCreator() {

  def getNew(): Product = {
    new ConcreteProduct("Default")
  }

}
