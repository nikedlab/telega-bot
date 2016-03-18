package com.nikedlab.telegram.whoiswho

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.boot.builder.SpringApplicationBuilder
import org.springframework.boot.context.web.SpringBootServletInitializer
import org.springframework.context.annotation.{ComponentScan, Configuration}
import org.springframework.scheduling.annotation.EnableScheduling

/**
  * Created with Comodo Inc.
  * User: Kuzmenko Victor
  * Date: 18.03.16
  * Time: 13:43
  */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@EnableScheduling
class Application extends SpringBootServletInitializer {

  override
  protected def configure(application: SpringApplicationBuilder): SpringApplicationBuilder = {
    application.sources(classOf[Application])
  }

  @throws[Exception]
  def main(args: Array[String]) {
    SpringApplication.run(classOf[Application])
  }

}
