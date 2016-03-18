package com.nikedlab.telegram.whoiswho.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
  * Created with NikedLab
  * Date: 18.03.16
  * Time: 12:12
  */

class Chat {

  @JsonProperty("id")
  var id: Int = 0

  @JsonProperty("type")
  var chatType: String = null

  @JsonProperty("first_name")
  var firstName: String = null

  @JsonProperty("last_name")
  var lastName: String = null

  @JsonProperty("title")
  var title: String = null

  @JsonProperty("username")
  var username: String = null

  override def toString = s"Chat(id=$id, chatType=$chatType, firstName=$firstName, lastName=$lastName, title=$title, username=$username)"
}
