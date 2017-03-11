package com.geekbing.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: bing
 * Date: 2017-03-11 09:43
 * Email: dhuzbb@163.com
 */
@RestController
public class TestController {

    @RequestMapping("/")
    public String index() {
        return "Hello World";
    }
}
