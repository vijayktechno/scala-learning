package com.vijay.scala.learnings.classandobjects

class Companion {

  private var name:String = "vijay"

}

object Companion {

  def main(args: Array[String]): Unit = {
    val cclazz = new Companion
    println(cclazz.name) // it can access the class's private variable
  }

}