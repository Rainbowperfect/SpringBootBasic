package com.person.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description com.person.controller
 */
//@EnableAutoConfiguration
//@ComponentScan(basePackages = "com.person")
//@ComponentScan("com.person")
@RestController
public class MainController {

    //@RequestMapping()
    @GetMapping("main")
    public String main(){
        return "hello my name is springBoot";
    }

    @GetMapping("main3")
    public String main3(){
        return "hello my name is springBoot3";
    }

    public static void main(String[] args) {
        SpringApplication.run(MainController.class);
    }
}
