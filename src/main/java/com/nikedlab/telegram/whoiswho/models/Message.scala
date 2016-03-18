package com.nikedlab.telegram.whoiswho.models

import com.fasterxml.jackson.annotation.JsonProperty

/**
  * Created with NikedLab
  * Date: 18.03.16
  * Time: 12:19
  */
class Message {

  @JsonProperty("message_id")
  var messageId: Int = 0

  @JsonProperty("from")
  var from: User = null

  @JsonProperty("date")
  var date: Int = 0

  @JsonProperty("chat")
  var chat: Chat = null

  @JsonProperty("forward_from")
  var forwardFrom: User = null

  @JsonProperty("forward_date")
  var forwardDate: Int = 0

  @JsonProperty("reply_to_message")
  var replyToMessage: Message = null

  @JsonProperty("text")
  var text: String = null

  override def toString = s"Message(messageId=$messageId, from=$from, date=$date, chat=$chat, forwardFrom=$forwardFrom, forwardDate=$forwardDate, replyToMessage=$replyToMessage, text=$text)"
}
