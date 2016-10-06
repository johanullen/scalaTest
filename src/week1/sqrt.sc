object sqrt {
  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double

  def sqrt(x: Double) = {

    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def isGoodEnough(guess: Double, x: Double) = abs(guess * guess / x - 1) < 0.0001

    def improve(guess: Double, x: Double) = (guess + x / guess) / 2

    sqrtIter(1.0, x)
  }                                               //> sqrt: (x: Double)Double
  sqrt(2.0)                                       //> res0: Double = 1.4142156862745097
  sqrt(4.0)                                       //> res1: Double = 2.0000000929222947
  sqrt(1e-6)                                      //> res2: Double = 0.0010000001533016628
  sqrt(1e-8)                                      //> res3: Double = 1.0000040611237676E-4
  sqrt(1e-12)                                     //> res4: Double = 1.0000001034612418E-6
  sqrt(1e6)                                       //> res5: Double = 1000.0001533016629
  sqrt(1e12)                                      //> res6: Double = 1000000.103461242
  sqrt(0.001)                                     //> res7: Double = 0.03162278245070105
  sqrt(0.1e-20)                                   //> res8: Double = 3.1622778383672726E-11
  sqrt(1.0e20)                                    //> res9: Double = 1.0000021484861237E10
  sqrt(1.0e50)                                    //> res10: Double = 1.0000003807575104E25

  def factorial(n: Int): Int = {
    def iterFactorial(n: Int, accum: Int): Int = {
      if (n <= 1) accum
      else iterFactorial(n - 1, n * accum)
    }
    iterFactorial(n, 1)
  }                                               //> factorial: (n: Int)Int
  factorial(1)                                    //> res11: Int = 1
  factorial(2)                                    //> res12: Int = 2
  factorial(3)                                    //> res13: Int = 6
  factorial(4)                                    //> res14: Int = 24
  factorial(5)                                    //> res15: Int = 120
  factorial(10)                                   //> res16: Int = 3628800
  factorial(20)                                   //> res17: Int = -2102132736

  def factorialOrg(n: Int): Int = {
    if (n <= 1) 1
    else n * factorialOrg(n - 1)
  }                                               //> factorialOrg: (n: Int)Int
  factorialOrg(1)                                 //> res18: Int = 1
  factorialOrg(2)                                 //> res19: Int = 2
  factorialOrg(3)                                 //> res20: Int = 6
  factorialOrg(4)                                 //> res21: Int = 24
  factorialOrg(5)                                 //> res22: Int = 120
}