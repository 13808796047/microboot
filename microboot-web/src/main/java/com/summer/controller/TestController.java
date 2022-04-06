package com.summer.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Summer
 * @date 2022/4/4 14:45
 */
@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping
    public String index(){
        return "SpringBoot Test";
    }
}
