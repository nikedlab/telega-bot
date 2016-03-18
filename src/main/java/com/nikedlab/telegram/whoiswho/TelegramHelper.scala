package com.nikedlab.telegram.whoiswho

import com.nikedlab.telegram.whoiswho.models._
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.web.client.RestTemplate


/**
  * Created with Comodo Inc.
  * User: Kuzmenko Victor
  * Date: 18.03.16
  * Time: 13:10
  */
@Component
class TelegramHelper {

  @Autowired private val restTemplate: RestTemplate = null

  private val token: String = "141532623:AAGniQpHeF-PNaRtxAkdmVNDrgPsoj2KxxM"
  private val url: String = "https://api.telegram.org/bot" + token

  var offset: Int = 0

  def checkUpdates: java.util.ArrayList[Update] = {
    val getUpdates: GetUpdates = new GetUpdates
    getUpdates.offset = offset + 1
    println("============> " + getUpdates)
    val result: Response = restTemplate.postForObject(url + "/getUpdates", getUpdates, classOf[Response])
    result.result
  }

  def sendToUser(text: String, message: Message): Unit = {
    val sendMessage: SendMessage = new SendMessage
    sendMessage.text = text
    sendMessage.chatId = message.chat.id
//    sendMessage.replyToMessageId = message.messageId
    val result: String = restTemplate.postForObject(url + "/sendMessage", sendMessage, classOf[String])
  }

  def getUser(update: Update): User = {
    update.message.from
  }

  def getMessage(update: Update): String = {
    update.message.text
  }

}
