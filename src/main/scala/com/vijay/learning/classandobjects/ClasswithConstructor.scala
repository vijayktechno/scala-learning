package com.vijay.scala.learnings.classandobjects

class ClasswithConstructor (someVariable: String) {

  def getSomeVariable(): String = {
    return "Good morning "+ someVariable
  }

}

object ClasswithConstructor{
  def main(args: Array[String]): Unit = {
    val cc = new ClasswithConstructor("vijay")
    println(cc.getSomeVariable())
  }
}
