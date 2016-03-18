package com.nikedlab.telegram.whoiswho.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
  * Created with NikedLab
  * Date: 18.03.16
  * Time: 12:30
  */
class Update {

  @JsonProperty("update_id")
  var updateId: Int = 0

  @JsonProperty("message")
  var message: Message = null

  override def toString = s"Update(updateId=$updateId, message=$message)"
}
