package week3

object list {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
  println("Welcome to the Scala worksheet");$skip(60); 
  def singleton[T](elem: T) = new Cons[T](elem, new Nil[T]);System.out.println("""singleton: [T](elem: T)week3.Cons[T]""");$skip(16); val res$0 = 
  singleton(19);System.out.println("""res0: week3.Cons[Int] = """ + $show(res$0));$skip(18); val res$1 = 
  singleton(true);System.out.println("""res1: week3.Cons[Boolean] = """ + $show(res$1));$skip(28); val res$2 = 
  singleton(1).findIndex(0);System.out.println("""res2: Int = """ + $show(res$2));$skip(30); val res$3 = 
  singleton(1).findIndex(-11);System.out.println("""res3: Int = """ + $show(res$3))}
}
