package com.vijay.scala.learnings.tuples

object TupleMain {

  def main(args: Array[String]): Unit = {
    tuple_operations()
  }

  def tuple_operations() = {
    val someTuple = (1, "vijay", "impetus")
    println("Id : "+someTuple._1)
    println("Name : "+someTuple._2)
    println("Company : "+someTuple._3)
  }

}
