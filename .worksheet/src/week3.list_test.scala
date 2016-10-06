package week3

object list_test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
  println("Welcome to the Scala worksheet");$skip(168); val res$0 = 
  /*def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])
  singleton(19)
  singleton(true)
  singleton(1).findIndex(0)
  //singleton(1).findIndex(-11)*/
  List(1);System.out.println("""res0: week3.List[Int] = """ + $show(res$0));$skip(13); val res$1 = 
  List(2, 3);System.out.println("""res1: week3.List[Int] = """ + $show(res$1));$skip(9); val res$2 = 
  List();System.out.println("""res2: week3.List[Nothing] = """ + $show(res$2));$skip(15); val res$3 = 
  List(1).tail;System.out.println("""res3: week3.List[Int] = """ + $show(res$3));$skip(50); 
	def f(xs: List[NonEmpty], x: Nil) = xs prepend x;System.out.println("""f: (xs: week3.List[week3.NonEmpty], x: <error>)<error>""");$skip(26); val res$4 = 
  List(1).prepend(List());System.out.println("""res4: week3.List[Any] = """ + $show(res$4))}
}
