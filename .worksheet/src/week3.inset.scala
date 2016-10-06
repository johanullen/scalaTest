package week3

object inset {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(74); 
  println("Welcome to the Scala worksheet");$skip(55); 
  val s1 = new NonEmpty(1, Empty, Empty) incl 2 incl 3;System.out.println("""s1  : week3.IntSet = """ + $show(s1 ));$skip(55); 
  val s2 = new NonEmpty(3, Empty, Empty) incl 4 incl 5;System.out.println("""s2  : week3.IntSet = """ + $show(s2 ));$skip(14); val res$0 = 
  s1 union s2;System.out.println("""res0: week3.IntSet = """ + $show(res$0))}
}
