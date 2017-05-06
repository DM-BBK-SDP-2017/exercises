package abstractfactory

object ParserFactoryProducer {
  def getFactory(s: String) = s match {
    case str:String if str.contains("NYC")
      => NYCFactory()
    case str: String if str.contains("London")
      => LondonFactory()
  }

  NYCErrorXMLParser

  NYCFeedbackXML
  NYCOrderXMLParser
  NYCResponseXMLParser

}
