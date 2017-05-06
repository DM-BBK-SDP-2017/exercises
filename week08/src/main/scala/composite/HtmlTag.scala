package composite

abstract class HtmlTag(tagName: String) {

  var taglist: List[HtmlTag] = List[HtmlTag]()

  var tagBody: String = _
  var startTag: String = _
  var endTag: String = _


  def getTagName: String = tagName

  def setStartTag(tag: String)

  def setEndTag(tag: String)

  def setTagBody(tagBody: String) = this.tagBody = tagBody

  def addChildTag(htmlTag: HtmlTag) = {taglist = taglist :+ htmlTag}

  def removeChildTag(htmlTag: HtmlTag) = {taglist = taglist.filterNot(x => x != htmlTag)}

  def getChildren: List[HtmlTag] = taglist

  def generateHtml
}