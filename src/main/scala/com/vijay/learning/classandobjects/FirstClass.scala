package com.vijay.scala.learnings.classandobjects

class FirstClass {

  private var sum: Int = 0;

  def add(num: Int) = {
    sum = sum + num;
  }

  def getSum() : Int = {
    return sum;
  }

}
