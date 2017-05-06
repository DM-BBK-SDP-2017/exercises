package interpreter

object ExpressionUtils {

  def isOperator(s: String): Boolean = "+-*".contains(s)

  def getOperator(s: String, left: Expression, right: Expression): Expression = s match {
    case "+" => new Add(left, right)
    case "*" => new Product(left, right)
    case "-" => new Minus(left, right)
  }
}