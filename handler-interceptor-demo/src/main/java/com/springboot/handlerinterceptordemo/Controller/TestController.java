package com.springboot.handlerinterceptordemo.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    Logger log = LoggerFactory.getLogger(getClass());
    @RequestMapping("/test")
    public String test(){
        log.info("这个是Controller");
        return "handlerInteceptorDemo";
    }
}
