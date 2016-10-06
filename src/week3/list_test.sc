package week3

object list_test {
  println("Welcome to the Scala worksheet")
  /*def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])
  singleton(19)
  singleton(true)
  singleton(1).findIndex(0)
  //singleton(1).findIndex(-11)*/
  List(1)
  List(2, 3)
  List()
  List(1).tail
	def f(xs: List[NonEmpty], x: Nil) = xs prepend x
  List(1).prepend(List())
}