package com.gss.myservice.controller;

import com.gss.utils.MyUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldTestController {
    private MyUtil util;
    public HelloWorldTestController(MyUtil myutil) {
        util = myutil;
    }

    @GetMapping("/helloworld")
    public String getHelloWorld()
    {
        return util.getMessage();
    }
}
