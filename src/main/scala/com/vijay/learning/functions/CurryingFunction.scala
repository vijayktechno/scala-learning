package com.vijay.scala.learnings.functions

object CurryingFunction {

  def sumup(x: Int)=(y: Int) => x+y

  def main(args: Array[String]): Unit = {
    val first = sumup(10)
    val second = first(10)
    println(second)
  }

}
