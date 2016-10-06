package week2

object sum {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(198); 
  def sum(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, acc + f(a))
    }
    loop(a, 0)
  };System.out.println("""sum: (f: Int => Int)(a: Int, b: Int)Int""");$skip(20); val res$0 = 
  sum(x => x)(1, 4);System.out.println("""res0: Int = """ + $show(res$0));$skip(28); val res$1 = 
  sum(x => x * x * x)(1, 4);System.out.println("""res1: Int = """ + $show(res$1));$skip(12); val res$2 = 
  1 * 1 * 1;System.out.println("""res2: Int = """ + $show(res$2));$skip(12); val res$3 = 
  2 * 2 * 2;System.out.println("""res3: Int = """ + $show(res$3));$skip(12); val res$4 = 
  3 * 3 * 3;System.out.println("""res4: Int = """ + $show(res$4));$skip(12); val res$5 = 
  4 * 4 * 4;System.out.println("""res5: Int = """ + $show(res$5));$skip(18); val res$6 = 
  1 + 8 + 27 + 64;System.out.println("""res6: Int = """ + $show(res$6));$skip(21); val res$7 = 
  sum(x => x)(0, 10);System.out.println("""res7: Int = """ + $show(res$7));$skip(20); val res$8 = 
  sum(x => x)(_, _);System.out.println("""res8: (Int, Int) => Int = """ + $show(res$8));$skip(16); val res$9 = 
  sum(x => x) _;System.out.println("""res9: (Int, Int) => Int = """ + $show(res$9));$skip(176); 

  def product(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, acc * f(a))
    }
    loop(a, 1)
  };System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(25); val res$10 = 

  product(x => x)(1, 4);System.out.println("""res10: Int = """ + $show(res$10));$skip(54); 

  def factorial(a: Int): Int = product(x => x)(1, a);System.out.println("""factorial: (a: Int)Int""");$skip(15); val res$11 = 
  factorial(5);System.out.println("""res11: Int = """ + $show(res$11));$skip(208); 

  def generic(o: (Int, Int) => Int, i: Int)(f: Int => Int)(a: Int, b: Int): Int = {
    def loop(a: Int, acc: Int): Int = {
      if (a > b) acc
      else loop(a + 1, o(acc, f(a)))
    }
    loop(a, i)
  };System.out.println("""generic: (o: (Int, Int) => Int, i: Int)(f: Int => Int)(a: Int, b: Int)Int""");$skip(45); val res$12 = 

  generic((x, y) => x * y, 1)(x => x)(1, 5);System.out.println("""res12: Int = """ + $show(res$12))}

}
