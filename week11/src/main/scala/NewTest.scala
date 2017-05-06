/**
  * Created by dannymadell on 06/05/2017.
  */
object NewTest extends App{

  def f(n: Int): Boolean = head % 2

  def filterEven(alist: List[Int]): List[Int] =
    alist match {
      case Nil => Nil
      case head :: tail => f(head)
      match {
        case true => head :: filterEven(tail)
        case false => filterEven(tail)
      }
    }



  def filter(f: Int => Boolean, alist: List[Int]): List[Int] =
    alist match {
      case Nil => Nil
      case head :: tail => f(head)
      match {
        case true => head :: filter(f, tail)
        case false => filter(f, tail)
      }
    }


  def filterEven(alist: List[Int]): List[Int] = {
    def f(n: Int): Boolean = head % 2
    filter(f, alist)
  }


  def doubleAll(alist: List[Int]) = map((n: Int) = > n * 2, alist)

  def removeOdds(alist: List[Int]) = filter((n: Int) = > n % 2 == 0, alist)


  def makeAdder(x: Int): Int => Int = {
    def add(y): Int = { x + y }
    add
  }
  val add10 = makeAdder(10)




}
