package xpayTests
import org.scalatest.FunSuite
import org.scalatest.BeforeAndAfter
import xpay._

/**
  * Created by dannymadell on 04/03/2017.
  */
class xpayTest extends FunSuite with BeforeAndAfter {

  var payD: PayD = _
  var xpayToPayDAdapter: XpayToPayDAdapter = _

  before {
    payD = new PayDImpl
    xpayToPayDAdapter = new XpayToPayDAdapter(payD)
  }

  test("something") {
    assert(1 == 1)
  }

}