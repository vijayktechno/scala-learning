package com.vijay.scala.learnings.classandobjects

object MainObject {


  def main(args: Array[String]): Unit = {
    val fc = new FirstClass
    fc.add(5)
    fc.add(10)
    val sum = fc.getSum()
    println(sum)
  }


}
