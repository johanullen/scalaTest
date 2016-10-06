package week2

object sum {
  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, acc + f(a))
    }
    loop(a, 0)
  }                                               //> sum: (f: Int => Int)(a: Int, b: Int)Int
  sum(x => x)(1, 4)                               //> res0: Int = 10
  sum(x => x * x * x)(1, 4)                       //> res1: Int = 100
  1 * 1 * 1                                       //> res2: Int = 1
  2 * 2 * 2                                       //> res3: Int = 8
  3 * 3 * 3                                       //> res4: Int = 27
  4 * 4 * 4                                       //> res5: Int = 64
  1 + 8 + 27 + 64                                 //> res6: Int = 100
  sum(x => x)(0, 10)                              //> res7: Int = 55
  sum(x => x)(_, _)                               //> res8: (Int, Int) => Int = <function2>
  sum(x => x) _                                   //> res9: (Int, Int) => Int = <function2>

  def product(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, acc * f(a))
    }
    loop(a, 1)
  }                                               //> product: (f: Int => Int)(a: Int, b: Int)Int

  product(x => x)(1, 4)                           //> res10: Int = 24

  def factorial(a: Int): Int = product(x => x)(1, a)
                                                  //> factorial: (a: Int)Int
  factorial(5)                                    //> res11: Int = 120

  def generic(o: (Int, Int) => Int, i: Int)(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, o(acc, f(a)))
    }
    loop(a, i)
  }                                               //> generic: (o: (Int, Int) => Int, i: Int)(f: Int => Int)(a: Int, b: Int)Int

  generic((x, y) => x * y, 1)(x => x)(1, 5)       //> res12: Int = 120

}