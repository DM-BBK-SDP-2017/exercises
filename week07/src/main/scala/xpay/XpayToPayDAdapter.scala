package xpay

/**
  * Created by dannymadell on 04/03/2017.
  */
class XpayToPayDAdapter(payD: PayD) extends Xpay {


  override def getCreditCardNo: String = payD.getCustCardNo

  override def setCreditCardNo(creditCardNo: String): Unit = payD.setCustCardNo(creditCardNo)

  override def getCustomerName: String = payD.getCardOwnerName

  override def setCustomerName(customerName: String): Unit = payD.setCardOwnerName(customerName)

  override def getCardExpMonth: String = payD.getCardExpMonthDate

  override def setCardExpMonth(cardExpMonth: String): Unit = payD.setCardExpMonthDate(cardExpMonth)

  override def getCardExpYear: String = payD.getCardExpYearDate

  override def setCardExpYear(cardExpYear: String): Unit = payD.setCardExpYearDate(cardExpYear)

  override def getCardCVVNo: Short = payD.getCVVNo.toShort

  override def setCardCVVNo(cardCVVNo: Short): Unit = payD.setCVVNo(cardCVVNo.toInt)

  override def getAmount: Double = payD.getTotalAmount

  override def setAmount(amount: Double): Unit = payD.setTotalAmount(amount)
}
