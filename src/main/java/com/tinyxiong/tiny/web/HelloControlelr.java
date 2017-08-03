package com.tinyxiong.tiny.web;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControlelr {

    @GetMapping("/hello")
    @ApiOperation(value = "hello测试", httpMethod = "GET", notes = "第一个hello Controller")
    String home() {
        return "Hello World!";
    }
}
