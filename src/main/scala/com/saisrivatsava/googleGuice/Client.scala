package com.saisrivatsava.googleGuice

import com.google.inject.Inject

class Client @Inject() (val ac: AirConditioner) extends IClient {
  ac.trigger
}