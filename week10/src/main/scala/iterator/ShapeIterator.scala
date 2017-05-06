package iterator

import java.util.Iterator

class ShapeIterator(private var shapes: Array[Shape]) extends Iterator[Shape] {

  private var index: Int = 0

  override def hasNext(): Boolean = (index < shapes.length)

  override def next(): Shape = {
    if (!hasNext()) {throw new NullPointerException("NULL")}
    val returnVal = shapes(index)
    index += 1
    returnVal
  }

  override def remove(): Unit = hasNext() match {
    case true => shapes = shapes.filterNot(x => x == shapes(index))
    case false => //do nothing
   }
}