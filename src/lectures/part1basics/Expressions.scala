package lectures.part1basics

object Expressions extends App {
    val x = 1+2 //Expressions
    println(x)

    println(1 + 2 * 4)
    //+ - * / & | ^ << >> >>> (right shift with zero extension)

    println(1 == x)
    // == != >= <=        (comparison operators)

    println(!(1 == x))
    // ! && ||            (Logical Operators)

    var aVariable = 2
    aVariable += 3
    println(aVariable)

    // Instructions (DO) and Expressions(VALUE)

    val aCondition = true
    val aConditionValue = if(aCondition) 5 else 3
    println(aConditionValue)

    println(if(aCondition) 5 else 3)

    var i = 0
    while (i < 10){
      println(i)
      i += 1
    }

    //NEVER WRITE THIS AGAIN

    //Everything in scala is expression !!!

    val aWeirdValue = aVariable = 3 // Unit == void
    println(aWeirdValue)

    //Code blocks
    val aCodeBlock = {
      val y = 2
      val z = y+1

      if (z > 2) "hello" else "Bye"
    }

    println(aCodeBlock)

    val someValue = {
      2 < 3
    }
    println(someValue)

    val someOtherValue = {
      if (someValue) 239 else 994
      42
    }
    println(someOtherValue)


}
