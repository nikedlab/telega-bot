package com.nikedlab.telegram.whoiswho.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
  * Created with Comodo Inc.
  * User: Kuzmenko Victor
  * Date: 18.03.16
  * Time: 13:18
  */
class SendMessage {

  @JsonProperty("chat_id")
  var chatId: Int = 0

  @JsonProperty("text")
  var text: String = ""

  @JsonProperty("reply_to_message_id")
  var replyToMessageId: Int = 0

}
