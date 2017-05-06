package chain

case class ExcelFileHandler(s: String) extends Handler {
  var handler: Handler = _

  override def setHandler(handler: Handler): Unit = this.handler = handler

  override def process(file: File): Unit = file.fileType match {
    case "excel" => println("Process and saving doc file... by " + s)
    case x: String if (handler != null) => {
      println("Excel Handler forwards request to " + handler.getHandlerName())
      if (handler != null) {
        handler.process(file)
      }
    }
    case x: String => println("File not supported")
  }

  override def getHandlerName(): String = "Excel Handler"
}
