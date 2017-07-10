package com.saisrivatsava.googleGuice.ACexample

import com.google.inject.Inject

class Client @Inject() (val ac: AirConditioner) extends IClient {
  ac.trigger
}