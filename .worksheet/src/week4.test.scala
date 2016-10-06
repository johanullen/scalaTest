package week4
import week3._

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(88); 
  println("Welcome to the Scala worksheet");$skip(64); 
  val a: Array[NonEmpty] = Array(new NonEmpty(1, Empty, Empty));System.out.println("""a  : Array[week3.NonEmpty] = """ + $show(a ));$skip(27); 
  val b: Array[IntSet] = a;System.out.println("""b  : Array[week3.IntSet] = """ + $show(b ));$skip(15); 
  b(0) = Empty;$skip(25); 
  val s: NonEmpty = a(0);System.out.println("""s  : week3.NonEmpty = """ + $show(s ))}
}
