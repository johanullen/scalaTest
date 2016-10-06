package idealized.scala

abstract class Nat {
  def isZero: Boolean
  def predecessor: Nat
  def successor: Nat = new Succ(this)
  def + (that: Nat): Nat
  def - (that: Nat): Nat
}

object Zero extends Nat {
  def isZero: Boolean = True
  def predecessor: Nat = throw new Exception("negative NAT")
  def + (that : Nat): Nat = that
  def - (that : Nat): Nat = {
    if(that.isZero==True) this
    else throw new Exception("negative NAT")
  }
  override def toString(): String = "0"
}
class Succ(n: Nat) extends Nat {
  def isZero: Boolean = False
  def predecessor: Nat = n
  def + (that : Nat): Nat = new Succ(n + that)
  def - (that : Nat): Nat = 
    if(that.isZero==True) this
    else n - that.predecessor
  override def toString(): String = {
    def loop(count: Int,  n: Nat): Int = {
      if(n.isZero==True) count
      else loop(count+1, n.predecessor)
    }
    loop(0, this).toString()
  }
}
