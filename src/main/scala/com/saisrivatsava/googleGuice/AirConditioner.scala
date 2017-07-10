package com.saisrivatsava.googleGuice

import com.google.inject.Inject

class AirConditioner @Inject() (val tempSensor: TemperatureSensor, val cooler: Cooler) extends IAirConditioner {

  def trigger = {
    
    if (tempSensor.isRoomHot) cooler.on else cooler.off
  
  }

}