package com.vijay.scala.learnings.map

object MapsMain {

  def main(args: Array[String]): Unit = {
    map_operations()
  }

  def map_operations() = {
    val personAgeMap:Map[String, Int] = Map("vijay"->33, "amar" -> 35, "subin"->36, "john"->35, "prabhu"->33)
    println(personAgeMap)
    val vijayAge = personAgeMap.get("vijay")
    println(vijayAge) //This will give optional value "Some(33)"
    println(vijayAge.get) //this will return actual value
  }

}
