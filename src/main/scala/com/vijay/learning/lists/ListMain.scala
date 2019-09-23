package com.vijay.scala.learnings.lists

object ListMain {

  def main(args: Array[String]): Unit = {
    concating_two_list()
  }

  //List are immutable and works like linkedList
  def listTypeExamples()={
    val fruits:List[String] = List("apple", "orange", "graphes")
    val numbers:List[List[Int]] = List(
                                      List(1, 2, 3), List(4, 5, 6)
                                  )
    val empty:List[Nothing] = List()
  }

  //Construct List using infix operator
  def list_construction_using_INFIX_operator()={
    val numbers:List[Int] = 1 :: 2 :: 3 :: Nil        //Nil is mandatory
    println(numbers)
  }

  def concating_two_list() = {
    val num1:List[Int] = 1 :: 2 :: Nil
    val num2:List[Int] = 3 :: 4 :: Nil
    val finalNums = num1 ::: num2      //this is concatnating operator :::
    println(finalNums)
  }

  def add_element_to_exiting_list() = {
    var numbers:List[Int] = List(1, 2, 3)
    var numbers2:List[Int] = 4 :: numbers   //we must prepend the elements
    println(numbers)
  }

}
