package week2

object fixpoint {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 
  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(11); val res$0 = 

  abs(-1);System.out.println("""res0: Double = """ + $show(res$0));$skip(321); 

  def fix(f: Double => Double, firstGuess: Double): Double = {
    def iterate(guess: Double): Double = {
      def evaluate(a: Double, b: Double): Boolean = abs(a / b - 1) <= 1e-5
      val newGuess = f(guess)
      if (evaluate(guess, newGuess)) guess
      else iterate(f(newGuess))
    }
    iterate(firstGuess)
  };System.out.println("""fix: (f: Double => Double, firstGuess: Double)Double""");$skip(26); val res$1 = 

  fix(x => 1 + x / 2, 1);System.out.println("""res1: Double = """ + $show(res$1));$skip(72); 

  def sqrt(x: Double): Double = {
    fix(y => (y + x / y) / 2, 1)
  };System.out.println("""sqrt: (x: Double)Double""");$skip(11); val res$2 = 

  sqrt(2);System.out.println("""res2: Double = """ + $show(res$2));$skip(10); val res$3 = 
  sqrt(4);System.out.println("""res3: Double = """ + $show(res$3));$skip(11); val res$4 = 
  sqrt(10);System.out.println("""res4: Double = """ + $show(res$4));$skip(16); val res$5 = 
  sqrt(0.1e-20);System.out.println("""res5: Double = """ + $show(res$5));$skip(13); val res$6 = 
  sqrt(1e60);System.out.println("""res6: Double = """ + $show(res$6));$skip(76); 

  def averageDamp(f: Double => Double)(x: Double): Double = (x + f(x)) / 2;System.out.println("""averageDamp: (f: Double => Double)(x: Double)Double""");$skip(78); 
  def sqrt2(x: Double): Double = {
    fix(averageDamp(y => x / y)(_), 1)
  };System.out.println("""sqrt2: (x: Double)Double""");$skip(12); val res$7 = 

  sqrt2(2);System.out.println("""res7: Double = """ + $show(res$7));$skip(11); val res$8 = 
  sqrt2(4);System.out.println("""res8: Double = """ + $show(res$8));$skip(12); val res$9 = 
  sqrt2(10);System.out.println("""res9: Double = """ + $show(res$9));$skip(17); val res$10 = 
  sqrt2(0.1e-20);System.out.println("""res10: Double = """ + $show(res$10));$skip(14); val res$11 = 
  sqrt2(1e60);System.out.println("""res11: Double = """ + $show(res$11))}

}
