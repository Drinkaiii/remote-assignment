package com.emample.assignment;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static java.lang.Integer.parseInt;

@RestController
@RequestMapping
public class GetDataController {
    @GetMapping("/")
    public String getHome() {
        System.out.println("getHome() request");
        return "Hello, My Server!";
    }
    @GetMapping("/data")
    public String getData(@RequestParam(required = false) String number) {
        System.out.println("getData() request");
        try {
            if (number == null)
                return "Lack of Parameter";
            if (!number.matches("[+-]?\\d*(\\.\\d+)?"))
                return "Wrong Parameter";
            return Integer.toString(parseInt(number) * (parseInt(number) + 1) / 2);
        }catch (NumberFormatException e) {
            return "Wrong Parameter";
        }
    }
}
