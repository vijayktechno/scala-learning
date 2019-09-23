package com.vijay.scala.learnings.functions

object LocalFunction {

  def processString(str: String) : String = {
    def formatString(str: String): String = {
     return  str + " Good morning"
    }
    return formatString(str);
  }

  def main(args: Array[String]): Unit = {
    println(processString("vijay"))
  }

}
