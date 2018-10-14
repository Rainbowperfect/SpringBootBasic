package com.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @version 1.0
 * @description com.person.controller
 */
@Controller
@RequestMapping("mvc")
public class JspController {
    @RequestMapping("hello")
    public String toPage(Model model){
        model.addAttribute("msg", "hi,steven is good..");
        return "hello";
    }
}
