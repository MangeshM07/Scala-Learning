package lectures.part1basics

object ValuesVariablesTypes extends App {
      val x: Int = 42
      println(x)

      //val is immutable

      //compiler can infer types

      val aString: String = "hello scala"
      val anotherString = "goodbye"

      val aBoolean: Boolean = true
      val achar: Char = 'a'
      val anInt: Int = x
      val aShort: Short = 12344
      val aLong: Long = 1234567777777L
      val float: Float = 3.1f
      val aDouble: Double = 3.14


      //Variables

      var aVariable: Int = 10

      aVariable = 5
}
