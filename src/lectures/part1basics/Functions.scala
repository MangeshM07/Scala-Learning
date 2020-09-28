package lectures.part1basics

object Functions extends  App{

  def aFunction(a : String, b : Int) : String = {
    a + " " + b
  }

  println(aFunction("hello",3))

  def aParameterlessFunction():Int = 42
  println(aParameterlessFunction())
  println(aParameterlessFunction)

  def aRepeatedFunction(aString : String, n : Int) : String = {
    if (n==1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }

  println(aRepeatedFunction("hello",3))

  //WHEN YOU NEED LOOPS, USE RECURSION.

  def aFunctionWithSideEffects(aString : String): Unit = println(aString)

  def aBigFunction(n : Int): Int = {
    def aSmallFunction(a : Int, b: Int): Int = a + b

    aSmallFunction(n, n-1)
  }

  def aFactorial(n: Int): Int = {

    if (n==1) n
    else n * aFactorial(n-1)
  }
  println(aFactorial(10))

  def fibonacci(n : Int): Int ={
    if (n<=2) 1
    else fibonacci(n-1) + fibonacci(n-2)
  }
  println(fibonacci(10))

  def isPrime(n : Int): Boolean = {
    def isPrimeUntil(t : Int) : Boolean =
      if (t<=1) true
      else n%t !=0 && isPrimeUntil(t-1)

    isPrimeUntil(n/2)
  }

  println(isPrime(37))
  println(isPrime(2003))
  println(isPrime(37 * 17))

  def greeting(aString : String, b : Int): String = {
    "Hi My name is "+ aString +" and I am "+ b + " years old"
  }
    println(greeting("Ram", 24))
}
