package week4

trait Expr {
  def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Sum(e1, e2) => eval(e1) + eval(e2)
    case Prod(e1, e2) => eval(e1) * eval(e2)
  }
}
case class Number(n: Int) extends Expr {

}

case class Sum(e1: Expr, e2: Expr) extends Expr {

}

case class Prod(e1: Expr, e2: Expr) extends Expr {

}
