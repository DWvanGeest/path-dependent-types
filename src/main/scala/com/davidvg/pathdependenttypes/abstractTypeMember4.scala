package com.davidvg.pathdependenttypes.abstracttypemember4

import com.davidvg.pathdependenttypes.abstracttypemember1._
import com.davidvg.pathdependenttypes.abstracttypemember2._

object App {
  val apiKeyAuthenticator = new ApiKeyAuthenticator
  val pinAuthenticator = new PinAuthenticator

  val apiKey: apiKeyAuthenticator.Credential = ApiKey("SUCH-SECRET")
  val pin: pinAuthenticator.Credential = Pin("1234")

  apiKeyAuthenticator.authenticate(apiKey)
  pinAuthenticator.authenticate(pin)

  // apiKeyAuthenticator.authenticate(pin)
  // type mismatch:
  //   found: Pin
  //   required: ApiKey
}
