package com.vijay.scala.learnings.functions

object FunctionalOverList {

  def main(args: Array[String]): Unit = {
    filterAndIterate()
  }

  def filterAndIterate():Unit = {
    val fruits = List("Apple", "Orange", "graphes", "watermelon", "tomato")
    fruits.filter((f:String) => f!="tomato").foreach((f:String)=>println(f))
  }

}
