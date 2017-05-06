package composite

// TODO
case class HtmlElement(s: String) extends HtmlTag(s) {


  override def setStartTag(tag: String): Unit = {startTag = tag}

  override def setEndTag(tag: String): Unit = {endTag = tag}

  override def generateHtml: Unit = {
    print(startTag)
    print(tagBody)
    println(endTag)
  }

}
