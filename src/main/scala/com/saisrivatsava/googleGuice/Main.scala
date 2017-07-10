package com.saisrivatsava.googleGuice

import com.google.inject.Guice

object Main {
  def main(args: Array[String]): Unit = {
    val injector = Guice.createInjector(new DependencyModule)
    val component = injector.getInstance(classOf[Client])
  }
}