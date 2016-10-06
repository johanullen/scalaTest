package week3

object inset {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(73); 
  println("Welcome to the Scala worksheet");$skip(55); 
  val s1 = new NonEmpty(1, Empty, Empty) incl 2 incl 3;System.out.println("""s1  : week3.IntSet = """ + $show(s1 ));$skip(55); 
  val s2 = new NonEmpty(3, Empty, Empty) incl 4 incl 5;System.out.println("""s2  : week3.IntSet = """ + $show(s2 ));$skip(14); val res$0 = 
  s1 union s2;System.out.println("""res0: week3.IntSet = """ + $show(res$0))}
}

abstract class IntSet {
  def incl(x: Int): IntSet
  def contains(x: Int): Boolean
  def union(other: IntSet): IntSet
}

object Empty extends IntSet {
  def incl(x: Int): IntSet = new NonEmpty(x, Empty, Empty)
  def contains(x: Int): Boolean = false
  def union(other: IntSet): IntSet = other
  override def toString(): String = "."
}

class NonEmpty(elem: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean = {
    if (x < elem) left contains x
    else if (x > elem) right contains x
    else true
  }
  def incl(x: Int) = {
    if (x < elem) new NonEmpty(elem, left incl x, right)
    else if (x > elem) new NonEmpty(elem, left, right incl x)
    else this
  }
  override def toString(): String = "{" + left + elem + right + "}"
  def union(other: IntSet): IntSet = {
    left union right union other incl elem
  }
}
