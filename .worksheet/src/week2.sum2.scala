package week2

object sum2{;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(252); 
  def sum(f: Int=> Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int = {
      def loop(a: Int, acc: Int): Int = {
        if(a>b) acc
        else loop(a+1, f(a) + acc)
      }
      loop(a,0)
    }
    sumF
  };System.out.println("""sum: (f: Int => Int)(Int, Int) => Int""");$skip(15); val res$0 = 
  
  sum(x=>x);System.out.println("""res0: (Int, Int) => Int = """ + $show(res$0));$skip(17); val res$1 = 
  sum(x=>x)(1,4);System.out.println("""res1: Int = """ + $show(res$1));$skip(31); 
  def cube(x:Int): Int = x*x*x;System.out.println("""cube: (x: Int)Int""");$skip(17); val res$2 = 
  sum(cube)(1,3);System.out.println("""res2: Int = """ + $show(res$2));$skip(30); val res$3 = 
  cube(1) + cube(2) + cube(3);System.out.println("""res3: Int = """ + $show(res$3));$skip(12); val res$4 = 
  sum(cube);System.out.println("""res4: (Int, Int) => Int = """ + $show(res$4))}
}
