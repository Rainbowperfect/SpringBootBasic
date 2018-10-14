package com.person.controller;

import com.person.pojo.User;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0
 * @description com.person.controller
 */
@RestController
@RequestMapping("rest")
public class RestWebServiceController {

    @GetMapping("getUserList")
    public List<User> getUserList(){
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "steven", 18));
        users.add(new User(2L, "steven2", 28));
        users.add(new User(3L, "steven3", 38));
        users.add(new User(4L, "steven4", 48));
        users.add(new User(5L, "steven5", 58));
        return users;
    }

    @GetMapping(value = "getXml",produces = MediaType.APPLICATION_XML_VALUE)
    public List<User> getUserXML(){
        List<User> users = new ArrayList<>();
        users.add(new User(1L, "steven", 18));
        users.add(new User(2L, "steven2", 28));
        users.add(new User(3L, "steven3", 38));
        users.add(new User(4L, "steven4", 48));
        users.add(new User(5L, "steven5", 58));
        return users;
    }
}
