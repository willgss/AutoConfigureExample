package com.gss.utils;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldUtil implements MyUtil {
    private String msg;

    @Override
    public String getMessage() {
        return "Hello world";
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
