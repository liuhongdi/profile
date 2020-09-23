package com.profile.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/home")
public class HomeController {

    @Value("${custom.orig}")
    private String origstr;

    @Value("${custom.active}")
    private String activestr;

    @GetMapping("/home")
    @ResponseBody
    public String home() {
        return "this is home/home page: active:"+activestr+";  orig:"+origstr;
    }
}
