package week4

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val n1 = new Number(29)                         //> n1  : week4.Number = 29
  val n2 = new Number(10)                         //> n2  : week4.Number = 10
  val n3 = new Number(2)                          //> n3  : week4.Number = 2
	new Sum(new Number(1), new Number(2))     //> res0: week4.Sum = 1+2
  new Prod(new Number(2), new Number(10))         //> res1: week4.Prod = 2*10
  new Prod(new Sum(n1,n2),n3)                     //> res2: week4.Prod = (29+10)*2
  new Prod(n3,new Sum(n1,n2))                     //> res3: week4.Prod = 2*(29+10)
  new Sum(Prod(n1,n2), n3)                        //> res4: week4.Sum = 29*10+2
}