package abstractfactory

trait XMLParser {
  def parse(): String

}


case class NYCErrorXMLParser() extends XMLParser {
  override def parse(): String = {
    println("NYC Parsing Error XML...")
    "NYC Error XML Message"
  }
}

case class NYCFeedbackXML() extends XMLParser {
  override def parse(): String = {
    println("NYC Parsing Feedback XML...")
    "NYC Feedback XML Message"
  }
}

case class NYCOrderXMLParser() extends XMLParser {
  override def parse(): String = {
    println("NYC Parsing Order XML...")
    "NYC Order XML Message"
  }
}

case class NYCResponseXMLParser() extends XMLParser {
  override def parse(): String = {
    println("NYC Parsing Response XML...")
    "NYC Response XML Message"
  }
}

case class LondonErrorXMLParser() extends XMLParser {
  override def parse(): String = {
    println("London Parsing Error XML...")
    "London Error XML Message"
  }
}

case class LondonFeedbackXML() extends XMLParser {
  override def parse(): String = {
    println("London Parsing Feedback XML...")
    "London Feedback XML Message"
  }
}

case class LondonOrderXMLParser() extends XMLParser {
  override def parse(): String = {
    println("London Parsing Order XML...")
    "London Order XML Message"
  }
}

case class LondonResponseXMLParser() extends XMLParser {
  override def parse(): String = {
    println("London Parsing Response XML...")
    "London Response XML Message"
  }
}
