package com.emample.assignment;

import org.springframework.web.bind.annotation.*;

import static java.lang.Integer.parseInt;

//Rest模式
//@CrossOrigin
@RestController
@RequestMapping
public class testController {
    @CrossOrigin
    @GetMapping("/")
    public String getHome() {
        System.out.println("getHome() request");
        return "Hello, My Server!";
    }
    @GetMapping("/data")
    public String getData(@RequestParam String number) {
        System.out.println("getData() request");
        if(number=="")
            return "Lack of Parameter";
        if(!number.matches("[+-]?\\d*(\\.\\d+)?"))
            return "Wrong Parameter";
        return Integer.toString(parseInt(number)*(parseInt(number)+1) / 2);
    }
}
