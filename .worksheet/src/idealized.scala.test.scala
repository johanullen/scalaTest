package idealized.scala

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 
  println("Welcome to the Scala worksheet");$skip(15); val res$0 = 
	True == False;System.out.println("""res0: idealized.scala.Boolean = """ + $show(res$0));$skip(14); val res$1 = 
	True == True;System.out.println("""res1: idealized.scala.Boolean = """ + $show(res$1));$skip(15); val res$2 = 
	True != False;System.out.println("""res2: idealized.scala.Boolean = """ + $show(res$2));$skip(14); val res$3 = 
	True != True;System.out.println("""res3: idealized.scala.Boolean = """ + $show(res$3));$skip(17); val res$4 = 
	
	True < False;System.out.println("""res4: idealized.scala.Boolean = """ + $show(res$4));$skip(14); val res$5 = 
	False < True;System.out.println("""res5: idealized.scala.Boolean = """ + $show(res$5));$skip(13); val res$6 = 
	True < True;System.out.println("""res6: idealized.scala.Boolean = """ + $show(res$6));$skip(15); val res$7 = 
	False < False;System.out.println("""res7: idealized.scala.Boolean = """ + $show(res$7));$skip(8); val res$8 = 
	
	Zero;System.out.println("""res8: idealized.scala.Zero.type = """ + $show(res$8));$skip(26); 
	val One = Zero.successor;System.out.println("""One  : idealized.scala.Nat = """ + $show(One ));$skip(25); 
	val Two = One.successor;System.out.println("""Two  : idealized.scala.Nat = """ + $show(Two ));$skip(11); val res$9 = 
	One + Two;System.out.println("""res9: idealized.scala.Nat = """ + $show(res$9));$skip(11); val res$10 = 
	Two - One;System.out.println("""res10: idealized.scala.Nat = """ + $show(res$10));$skip(11); val res$11 = 
	One - Two;System.out.println("""res11: idealized.scala.Nat = """ + $show(res$11))}
	
	
}
