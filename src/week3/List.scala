package week3

trait List[+T] {
  def isEmpty: Boolean
  def head: T
  def tail: List[T]
  def findIndex(index: Int): T = {
    def loop(count: Int, l: List[T]): T = {
      if (l.isEmpty) throw new IndexOutOfBoundsException()
      else if (count == index) l.head
      else loop(count + 1, l.tail)
    }
    loop(0, this)
  }
  def prepend[U >: T](elem: U): List[U] = new Cons[U](elem, this)
}
class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty() = false
  override def toString(): String = "" + head + "," + tail
}
object Nil extends List[Nothing] {
  def isEmpty() = true
  def head: Nothing = throw new NoSuchElementException("Nik.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
  override def toString(): String = "nil"
}

object List {
  def apply[T](): List[T] = Nil
  def apply[T](x: T): List[T] = {
    new Cons[T](x, List[T]())
  }
  def apply[T](a: T, b: T): List[T] = {
    new Cons[T](a, List(b))
  }
}