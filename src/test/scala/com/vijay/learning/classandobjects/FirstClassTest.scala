package com.vijay.learning.classandobjects

import com.vijay.scala.learnings.classandobjects.FirstClass
import org.scalatest.{BeforeAndAfter, FunSuite}

class FirstClassTest extends FunSuite with BeforeAndAfter{

  var fc:FirstClass = _

  before {
   fc = new FirstClass
  }

  test("hello world to test") {
    fc.add(10)
    assert(10 == fc.getSum())
  }

}
