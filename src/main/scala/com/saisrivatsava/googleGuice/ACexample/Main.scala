package com.saisrivatsava.googleGuice.ACexample

import com.google.inject.Guice

object Main {
  def main(args: Array[String]): Unit = {
    val injector = Guice.createInjector(new DependencyModule)
    val component = injector.getInstance(classOf[Client])
  }
}