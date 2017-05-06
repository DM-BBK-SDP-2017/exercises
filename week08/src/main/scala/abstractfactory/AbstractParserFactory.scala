package abstractfactory


trait AbstractParserFactory {
  def getParserInstance(parserType: String): XMLParser
}

case class NYCFactory() extends AbstractParserFactory {
  override def getParserInstance(parserType: String): XMLParser = parserType match {
    case "NYCERROR" =>  NYCErrorXMLParser()
    case "NYCFEEDBACK" => NYCFeedbackXML()
    case "NYCORDER" =>  NYCOrderXMLParser()
    case "NYCRESPONSE" => NYCResponseXMLParser()
  }
}

case class LondonFactory() extends AbstractParserFactory {
  override def getParserInstance(parserType: String): XMLParser = parserType match {
    case "LondonERROR" => LondonErrorXMLParser()
    case "LondonFEEDBACK" => LondonFeedbackXML()
    case "LondonORDER" => LondonOrderXMLParser()
    case "LondonRESPONSE" => LondonResponseXMLParser()
  }
}