package com.vijay.scala.learnings.functions

object FunctionMain {

  def main(args: Array[String]): Unit = {

    exploreVariables
    val min:Int = exploreFunctions(5, 10)
    println(min)

  }

  //function without return type
  def exploreVariables() = {
    val greeting: String = "Good morning"
    val smartGreeting = "Good morning"

    var stockPrice = 100.1
    stockPrice = 110.3

    var price: Double = 200.33
  }

  //function with return type
  def exploreFunctions(x:Int, y:Int): Int = {
        if ( x < y )
          x
        else
          y
  }



}
