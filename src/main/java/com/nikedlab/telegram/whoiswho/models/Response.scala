package com.nikedlab.telegram.whoiswho.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
  * Created with NikedLab
  * Date: 18.03.16
  * Time: 12:27
  */
class Response {

  @JsonProperty("ok")
  var ok: Boolean = false

  @JsonProperty("result")
  var result: java.util.ArrayList[Update] = null

  override def toString = s"Response(ok=$ok, result=$result)"
}
