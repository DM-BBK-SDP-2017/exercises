/**
  *
  *
  * Created by dannymadell on 19/02/2017.
  */

package week05

case class Counter(int: Int = 0) {

  val DEFAULT_INCREMENT = 1


  def inc(): Counter = {
    new Counter(int + 1)
  }

  def inc(incInt: Int): Counter = {
    new Counter(int + incInt)
  }

  def dec(incInt: Int): Counter = {
    new Counter(int - incInt)
  }

  def dec(): Counter = {
    new Counter(int - 1)
  }

  def count(): Int = {
    int
  }

  def adjust(adder: Adder): Counter = {
    new Counter(adder.add(int))
  }


}