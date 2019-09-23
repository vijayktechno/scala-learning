package com.vijay.scala.learnings.lists

object FunctionalListMain {

  def main(args: Array[String]): Unit = {
    sorting_with_list()
  }

  def map_with_list() = {
    val names:List[String] = List("vijay", "amar", "subin", "prabhu", "john")
    val greestings:List[String] = names.map(_+" Good morning")
    println(greestings)
  }

  def flatmap_with_list()={
    val listOfList:List[List[String]] = List(List("a", "b", "c"), List("d", "e", "f"))
    val flattenList = listOfList.flatMap(_.toList)
    println(flattenList)
  }

  def filter_with_list()={
    val list_with_filter:List[Int] = List(1, 2, 3, 4, 0)
    list_with_filter.filter(_>1).foreach(println(_))
  }

  def sorting_with_list()={
    val numbers:List[Int] = List(-1, 0, 2, 3, 1)
    val sortedList = numbers.sortWith(_ > _).foreach(println(_))
  }

}
