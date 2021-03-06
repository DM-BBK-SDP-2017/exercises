package bridge

// TODO

case class BigWheel(product: Product, s: String) extends Car(product, s) {
  override def assemble: Unit = println(s"Assembling $product according to $s")

  override def produceProduct: Unit = {
    product.produce
    println(s"Modifying product $product according to $s")
  }

  override def printDetails: Unit = println("Car: " + s + ", Product:" + product.productName)
}
