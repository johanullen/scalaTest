package week4

trait Expr {
  def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Sum(e1, e2) => eval(e1) + eval(e2)
    case Prod(e1, e2) => eval(e1) * eval(e2)
  }
  def show(e: Expr): String = e match {
    case Number(n) => n.toString()
    case Prod(e1, e2) => {
      def paren(e: Expr): String = e match {
        case Sum(_,_) => "(" + show(e) + ")"
        case _ => show(e)
      }
      paren(e1) + "*" + paren(e2)
    }
    case Sum(e1, e2) => show(e1) + "+" + show(e2)
  }
  override def toString(): String = show(this)
}
case class Number(n: Int) extends Expr {

}

case class Sum(e1: Expr, e2: Expr) extends Expr {

}

case class Prod(e1: Expr, e2: Expr) extends Expr {

}
