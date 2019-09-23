package com.vijay.scala.learnings.sets

object SetsMain {

  def main(args: Array[String]): Unit = {
    add_multiple_elements()
  }

  def first_set_ops() = {
    var fruits:Set[String] = Set( "apple", "orange", "apple")
    println(fruits)
    fruits = fruits + "grapes"
    println(fruits)
  }

  def add_multiple_elements() = {
    var numbers:Set[Int] = Set(1, 2, 3)
    numbers = numbers ++ List(4, 5)
    println(numbers)
  }

}
