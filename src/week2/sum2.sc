package week2

object sum2{
  def sum(f: Int=> Int): (Int, Int) => Int = {
    def sumF(a: Int, b: Int): Int = {
      def loop(a: Int, acc: Int): Int = {
        if(a>b) acc
        else loop(a+1, f(a) + acc)
      }
      loop(a,0)
    }
    sumF
  }                                               //> sum: (f: Int => Int)(Int, Int) => Int
  
  sum(x=>x)                                       //> res0: (Int, Int) => Int = <function2>
  sum(x=>x)(1,4)                                  //> res1: Int = 10
  def cube(x:Int): Int = x*x*x                    //> cube: (x: Int)Int
  sum(cube)(1,3)                                  //> res2: Int = 36
  cube(1) + cube(2) + cube(3)                     //> res3: Int = 36
  sum(cube)                                       //> res4: (Int, Int) => Int = <function2>
  
}