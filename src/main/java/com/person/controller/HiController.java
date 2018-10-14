package com.person.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description com.person.controller
 * @date
 */
@RestController
public class HiController {

    @GetMapping("hi")
    public String sayHi(){
        return "hi,my name is today.";
    }
}
