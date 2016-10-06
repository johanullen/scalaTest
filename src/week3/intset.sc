package week3

object inset {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val s1 = new NonEmpty(1, Empty, Empty) incl 2 incl 3
                                                  //> s1  : week3.IntSet = {.1{.2{.3.}}}
  val s2 = new NonEmpty(3, Empty, Empty) incl 4 incl 5
                                                  //> s2  : week3.IntSet = {.3{.4{.5.}}}
  s1 union s2                                     //> res0: week3.IntSet = {{{.1.}2.}3{.4{.5.}}}
}
