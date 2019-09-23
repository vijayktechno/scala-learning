package com.vijay.scala.learnings.functions

object FunctionalProgramming {

  var add = (x: Int, y: Int) => x + y;

  var greet = (name: String) => {
    println("the input name is "+name)
    println("greeting process start")
    println(name + " Good morning")
  }

  def main(args: Array[String]): Unit = {
    println(add(100, 100));
    greet("vijay")
  }


}
