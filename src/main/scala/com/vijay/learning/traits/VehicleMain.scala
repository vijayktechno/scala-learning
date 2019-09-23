package com.vijay.scala.learnings.traits

object VehicleMain {

  def main(args: Array[String]): Unit = {
    val car = new Car
    car.move()
    car.transport()

    val bike = new Bike
    bike.move()
    bike.transport()
  }

}
