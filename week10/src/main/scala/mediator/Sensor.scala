package mediator

import scala.util.Random

class Sensor {


  /**
    * To roughly simulate waiting for it to heat up
    * @return
    */
  def currentTemp: Int = {
    Random.nextInt(50)

  }
  def checkTemperature(temp: Int): Boolean = {
    temp <= currentTemp
  }

}