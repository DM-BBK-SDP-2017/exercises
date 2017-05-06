package factory

/**
  * Created by dannymadell on 24/02/2017.
  *
  * Creator declares the factory method, which returns an object of type Product.
Creator may also define a default implementation of the factory method that
returns a default ConcreteProduct object. We may call the factory method to
create a Product object.

  */
class Creator {

  def getNew(something: String): Product = {
    new ConcreteProduct(something)
  }

  def getNew(): Product = {
    new ConcreteProduct("Default")
  }

}
