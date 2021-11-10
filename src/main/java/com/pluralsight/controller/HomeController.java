package com.pluralsight.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcome() {
        return "index";
    }

    @RequestMapping("/downloads")
    public String downloads() {
        return "downloads";
    }
}
