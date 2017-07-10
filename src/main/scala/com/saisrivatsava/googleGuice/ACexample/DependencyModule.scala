package com.saisrivatsava.googleGuice.ACexample

import com.google.inject.Binder
import com.google.inject.Module

class DependencyModule extends Module {
  def configure(binder: Binder) = {
    binder.bind(classOf[OnOffDevice]).to(classOf[Cooler])
    binder.bind(classOf[SensorDevice]).to(classOf[TemperatureSensor])
    binder.bind(classOf[IAirConditioner]).to(classOf[AirConditioner])
    binder.bind(classOf[IClient]).to(classOf[Client])
  }
}