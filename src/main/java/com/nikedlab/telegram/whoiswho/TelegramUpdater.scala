package com.nikedlab.telegram.whoiswho

import com.nikedlab.telegram.whoiswho.models.Update
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import scala.collection.JavaConversions._

/**
  * Created with Comodo Inc.
  * User: Kuzmenko Victor
  * Date: 18.03.16
  * Time: 13:41
  */
@Component
class TelegramUpdater {

  @Autowired
  private val telegramHelper: TelegramHelper = null

  @Scheduled(fixedRate = 5000)
  def update(): Unit = {

    val updates: java.util.ArrayList[Update] = telegramHelper.checkUpdates

    updates.foreach(i=>{
      println(i.updateId)
      telegramHelper.sendToUser("Hello " + i.message.from.username + " !", i.message)
      telegramHelper.offset = i.updateId
    })

  }

}
