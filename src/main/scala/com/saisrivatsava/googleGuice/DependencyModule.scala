package com.saisrivatsava.googleGuice

import com.google.inject.Module
import com.google.inject.Binder

class DependencyModule extends Module {
  def configure(binder: Binder) = {
    binder.bind(classOf[OnOffDevice]).to(classOf[Cooler])
    binder.bind(classOf[SensorDevice]).to(classOf[TemperatureSensor])
    binder.bind(classOf[IAirConditioner]).to(classOf[AirConditioner])
    binder.bind(classOf[IClient]).to(classOf[Client])
  }

}