package xpay


/**
  * Created by dannymadell on 04/03/2017.
  */
class PayDImpl extends PayD {

  override def getCustCardNo: String = ???

  override def setCustCardNo(custCardNo: String): Unit = ???

  override def getCardOwnerName: String = ???

  override def setCardOwnerName(cardOwnerName: String): Unit = ???

  override def getCardExpMonthDate: String = ???

  override def setCardExpMonthDate(cardExpMonthDate: String): Unit = ???

  override def getCVVNo: Integer = ???

  override def setCVVNo(cVVNo: Integer): Unit = ???

  override def getTotalAmount: Double = ???

  override def setTotalAmount(totalAmount: Double): Unit = ???

  override def getCardExpYearDate: String = ???

  override def setCardExpYearDate(cardExpYear: String): Unit = ???
}
