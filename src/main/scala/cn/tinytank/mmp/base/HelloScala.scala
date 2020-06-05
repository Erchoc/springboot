package cn.tinytank.mmp.base

import org.springframework.web.bind.annotation.{RequestMapping, RequestMethod, RestController}

@RestController
class HelloScala {

  @RequestMapping(value = Array("/scala"), method = Array(RequestMethod.GET))
  def sayHello() = {

    "Hello World, I'm 姚敏丽"
  }

}
