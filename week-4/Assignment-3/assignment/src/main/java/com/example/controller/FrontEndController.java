package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FrontEndController {

    @GetMapping("/index")
    public String homepage() {
        return "index";
    }

    @GetMapping("/memberPage")
    public String memberPage() {
        return "memberPage";
    }

}
