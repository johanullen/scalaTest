package week2

object fixpoint {
  def abs(x: Double) = if (x < 0) -x else x       //> abs: (x: Double)Double

  abs(-1)                                         //> res0: Double = 1.0

  def fix(f: Double => Double, firstGuess: Double): Double = {
    def iterate(guess: Double): Double = {
      def evaluate(a: Double, b: Double): Boolean = abs(a / b - 1) <= 1e-5
      val newGuess = f(guess)
      if (evaluate(guess, newGuess)) guess
      else iterate(f(newGuess))
    }
    iterate(firstGuess)
  }                                               //> fix: (f: Double => Double, firstGuess: Double)Double

  fix(x => 1 + x / 2, 1)                          //> res1: Double = 1.9999847412109375

  def sqrt(x: Double): Double = {
    fix(y => (y + x / y) / 2, 1)
  }                                               //> sqrt: (x: Double)Double

  sqrt(2)                                         //> res2: Double = 1.4142135623746899
  sqrt(4)                                         //> res3: Double = 2.0000000929222947
  sqrt(10)                                        //> res4: Double = 3.162277660168379
  sqrt(0.1e-20)                                   //> res5: Double = 3.1622778383672726E-11
  sqrt(1e60)                                      //> res6: Double = 1.0E30

  def averageDamp(f: Double => Double)(x: Double): Double = (x + f(x)) / 2
                                                  //> averageDamp: (f: Double => Double)(x: Double)Double
  def sqrt2(x: Double): Double = {
    fix(averageDamp(y => x / y)(_), 1)
  }                                               //> sqrt2: (x: Double)Double

  sqrt2(2)                                        //> res7: Double = 1.4142135623746899
  sqrt2(4)                                        //> res8: Double = 2.0000000929222947
  sqrt2(10)                                       //> res9: Double = 3.162277660168379
  sqrt2(0.1e-20)                                  //> res10: Double = 3.1622778383672726E-11
  sqrt2(1e60)                                     //> res11: Double = 1.0E30

}