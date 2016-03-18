package com.nikedlab.telegram.whoiswho.config

import com.nikedlab.telegram.whoiswho.TelegramHelper
import org.springframework.context.annotation.{Bean, Configuration}
import org.springframework.web.client.RestTemplate

/**
  * Created with Comodo Inc.
  * User: Kuzmenko Victor
  * Date: 18.03.16
  * Time: 13:39
  */
@Configuration
class Config {

  @Bean
  def restTemplate: RestTemplate = new RestTemplate

  @Bean
  def telegramHelper: TelegramHelper = new TelegramHelper

}
