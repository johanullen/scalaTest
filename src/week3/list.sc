package week3

object list {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])
                                                  //> singleton: [T](elem: T)week3.Cons[T]
  singleton(19)                                   //> res0: week3.Cons[Int] = 19,nil
  singleton(true)                                 //> res1: week3.Cons[Boolean] = true,nil
  singleton(1).findIndex(0)                       //> res2: Int = 1
  singleton(1).findIndex(-11)                     //> java.lang.IndexOutOfBoundsException: index too high
                                                  //| 	at week3.List$class.loop$1(List.scala:9)
                                                  //| 	at week3.List$class.findIndex(List.scala:13)
                                                  //| 	at week3.Cons.findIndex(List.scala:16)
                                                  //| 	at week3.list$$anonfun$main$1.apply$mcV$sp(week3.list.scala:9)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week3.list$.main(week3.list.scala:3)
                                                  //| 	at week3.list.main(week3.list.scala)
}