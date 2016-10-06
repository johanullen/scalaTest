package idealized.scala

object test {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
	True == False                             //> res0: idealized.scala.Boolean = False
	True == True                              //> res1: idealized.scala.Boolean = True
	True != False                             //> res2: idealized.scala.Boolean = True
	True != True                              //> res3: idealized.scala.Boolean = False
	
	True < False                              //> res4: idealized.scala.Boolean = False
	False < True                              //> res5: idealized.scala.Boolean = True
	True < True                               //> res6: idealized.scala.Boolean = False
	False < False                             //> res7: idealized.scala.Boolean = False
	
	Zero                                      //> res8: idealized.scala.Zero.type = 0
	val One = Zero.successor                  //> One  : idealized.scala.Nat = 1
	val Two = One.successor                   //> Two  : idealized.scala.Nat = 2
	One + Two                                 //> res9: idealized.scala.Nat = 3
	Two - One                                 //> res10: idealized.scala.Nat = 1
	One - Two                                 //> java.lang.Exception: negative NAT
                                                  //| 	at idealized.scala.Zero$.$minus(Nat.scala:17)
                                                  //| 	at idealized.scala.Succ.$minus(Nat.scala:27)
                                                  //| 	at idealized.scala.test$$anonfun$main$1.apply$mcV$sp(idealized.scala.tes
                                                  //| t.scala:20)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at idealized.scala.test$.main(idealized.scala.test.scala:3)
                                                  //| 	at idealized.scala.test.main(idealized.scala.test.scala)
	
	
}