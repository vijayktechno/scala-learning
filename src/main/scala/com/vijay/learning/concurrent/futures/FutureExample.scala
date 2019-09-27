package com.vijay.learning.concurrent.futures

import scala.concurrent.Future
import scala.util.{Failure, Success}
import scala.concurrent.ExecutionContext.Implicits.global
//importing of ExecutionContext.Implicits.global is very important otherwise compilation exception

object FutureExample {

  def main(args: Array[String]): Unit = {
    //futureWithOncompleteExample()
    doSomeAsyncTask(100).onComplete{
      case Success(value) => println("computed value :: "+value)
      case Failure(exception) => exception.printStackTrace()
    }
    Thread.sleep(2000) //wait here to print the result
    println("i am done")
  }

  //importing of ExecutionContext.Implicits.global is very important otherwise compilation exception
  def futureWithOncompleteExample(): Unit ={
    val somNumber:Future[Int] = Future {
      Thread.sleep(100)
      42
    }
    somNumber.onComplete {
      case Success(value) => println("complted with number :: "+value)
      case Failure(exception) => exception.printStackTrace()
    }
  }

  //importing of ExecutionContext.Implicits.global is very important otherwise compilation exception
  def doSomeAsyncTask(num:Int) : Future[Int] = Future {
    Thread.sleep(1000)
    num+1000
  }

}
