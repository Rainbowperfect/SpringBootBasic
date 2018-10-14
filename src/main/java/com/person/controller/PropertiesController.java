package com.person.controller;

import com.person.pojo.ConfigBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version 1.0
 * @description com.person.controller
 */
@RestController
@RequestMapping("pro")
public class PropertiesController {

    @Value("${jdbc.name}")
    private String name;
    @Value("${jdbc.pass}")
    private String pass;
    @Value("${my.name}")
    private String userName;

    @GetMapping("getPro")
    public String getPro(){
        return name + ":" + pass + ">>>>>" + userName + "<<<<你好，我是帅哥";
    }

    @Autowired
    private ConfigBean configBean;
    @GetMapping("getConfigBean")
    public ConfigBean getConfigBean(){
        return configBean;
    }
}
