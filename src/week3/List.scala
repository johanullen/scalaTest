package week3

trait List[T] {
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
}
class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty() = false
  override def toString(): String = "" + head + "," + tail
}
class Nil[T] extends List[T] {
  def isEmpty() = true
  def head: Nothing = throw new NoSuchElementException("Nik.head")
  def tail: Nothing = throw new NoSuchElementException("Nil.tail")
  override def toString(): String = "nil"
}
