package com.vijay.learning.csv

import java.io.{BufferedWriter, FileWriter}
import com.opencsv.CSVWriter
import scala.concurrent.forkjoin.ThreadLocalRandom

object CSVGenerator {

  def main(args: Array[String]): Unit = {
    var csvWriter:CSVWriter = null
    try {
      val outputFile = new BufferedWriter(new FileWriter("src/main/resources/readings.csv"))
      csvWriter = new CSVWriter(outputFile)
      val tempHeadings: Array[String] = Array("sensorId", "capturedTime", "temperature")
      csvWriter.writeNext(tempHeadings)
      for (times <- 0 to 1000) {
        val row: Array[String] = Array(generateSensorId.toString, generateDateTimeMillis.toString, generateTemperatureReadings.toString)
        csvWriter.writeNext(row)
      }
    }
    catch {
      case e => e.printStackTrace()
    }
    finally {
      csvWriter.flushQuietly()
      csvWriter.close()
    }
    println("done")
  }

  def generateSensorId(): Int ={
    val random:ThreadLocalRandom = ThreadLocalRandom.current()
    val sensorId = random.nextInt(10, 15)
    sensorId
  }

  def generateDateTimeMillis()={
    val random:ThreadLocalRandom = ThreadLocalRandom.current()
    val capturedTimeInMillis = random.nextLong(1557495135749L, 1569595202282L)
    capturedTimeInMillis
  }

  def generateTemperatureReadings(): Double ={
    val random:ThreadLocalRandom = ThreadLocalRandom.current()
    val value = random.nextDouble(80.0, 100.0)
    value
  }

}
