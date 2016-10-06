object sqrt {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(57); 
  def abs(x: Double) = if (x < 0) -x else x;System.out.println("""abs: (x: Double)Double""");$skip(344); 

  def sqrt(x: Double) = {

    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def isGoodEnough(guess: Double, x: Double) = abs(guess * guess / x - 1) < 0.0001

    def improve(guess: Double, x: Double) = (guess + x / guess) / 2

    sqrtIter(1.0, x)
  };System.out.println("""sqrt: (x: Double)Double""");$skip(12); val res$0 = 
  sqrt(2.0);System.out.println("""res0: Double = """ + $show(res$0));$skip(12); val res$1 = 
  sqrt(4.0);System.out.println("""res1: Double = """ + $show(res$1));$skip(13); val res$2 = 
  sqrt(1e-6);System.out.println("""res2: Double = """ + $show(res$2));$skip(13); val res$3 = 
  sqrt(1e-8);System.out.println("""res3: Double = """ + $show(res$3));$skip(14); val res$4 = 
  sqrt(1e-12);System.out.println("""res4: Double = """ + $show(res$4));$skip(12); val res$5 = 
  sqrt(1e6);System.out.println("""res5: Double = """ + $show(res$5));$skip(13); val res$6 = 
  sqrt(1e12);System.out.println("""res6: Double = """ + $show(res$6));$skip(14); val res$7 = 
  sqrt(0.001);System.out.println("""res7: Double = """ + $show(res$7));$skip(16); val res$8 = 
  sqrt(0.1e-20);System.out.println("""res8: Double = """ + $show(res$8));$skip(15); val res$9 = 
  sqrt(1.0e20);System.out.println("""res9: Double = """ + $show(res$9));$skip(15); val res$10 = 
  sqrt(1.0e50);System.out.println("""res10: Double = """ + $show(res$10));$skip(186); 

  def factorial(n: Int): Int = {
    def iterFactorial(n: Int, accum: Int): Int = {
      if (n <= 1) accum
      else iterFactorial(n - 1, n * accum)
    }
    iterFactorial(n, 1)
  };System.out.println("""factorial: (n: Int)Int""");$skip(15); val res$11 = 
  factorial(1);System.out.println("""res11: Int = """ + $show(res$11));$skip(15); val res$12 = 
  factorial(2);System.out.println("""res12: Int = """ + $show(res$12));$skip(15); val res$13 = 
  factorial(3);System.out.println("""res13: Int = """ + $show(res$13));$skip(15); val res$14 = 
  factorial(4);System.out.println("""res14: Int = """ + $show(res$14));$skip(15); val res$15 = 
  factorial(5);System.out.println("""res15: Int = """ + $show(res$15));$skip(16); val res$16 = 
  factorial(10);System.out.println("""res16: Int = """ + $show(res$16));$skip(16); val res$17 = 
  factorial(20);System.out.println("""res17: Int = """ + $show(res$17));$skip(92); 

  def factorialOrg(n: Int): Int = {
    if (n <= 1) 1
    else n * factorialOrg(n - 1)
  };System.out.println("""factorialOrg: (n: Int)Int""");$skip(18); val res$18 = 
  factorialOrg(1);System.out.println("""res18: Int = """ + $show(res$18));$skip(18); val res$19 = 
  factorialOrg(2);System.out.println("""res19: Int = """ + $show(res$19));$skip(18); val res$20 = 
  factorialOrg(3);System.out.println("""res20: Int = """ + $show(res$20));$skip(18); val res$21 = 
  factorialOrg(4);System.out.println("""res21: Int = """ + $show(res$21));$skip(18); val res$22 = 
  factorialOrg(5);System.out.println("""res22: Int = """ + $show(res$22))}
  
}
