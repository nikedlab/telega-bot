package com.nikedlab.telegram.whoiswho.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
  * Created with Comodo Inc.
  * User: Kuzmenko Victor
  * Date: 18.03.16
  * Time: 14:11
  */
class GetUpdates {

  @JsonProperty("offset")
  var offset: Int = 0

  @JsonProperty("limit")
  var limit: Int = 0

  @JsonProperty("timeout")
  var timeout: Int = 0

  override def toString = s"GetUpdates(offset=$offset, limit=$limit, timeout=$timeout)"
}
