package cn.tinytank.mmp.base;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @RequestMapping(value = "/", method = RequestMethod.GET )
    public String sayHello() {

        return "Hello World, I'm 杨雪晋";
    }
}
