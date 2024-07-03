package com.emample.assignment;

import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.file.Files;
import java.nio.file.Paths;

@RestController
@RequestMapping
public class CookieController {

    @GetMapping(value = "/myName")
    public String showCookie(@CookieValue(value = "username",required = false) String username) throws UnsupportedEncodingException{
        if(username != null)
            //decode and return cookie on page
            return URLDecoder.decode(username,"UTF-8");
        else
            return switchOtherPage("src/main/resources/static/inputName.html");
    }
    @GetMapping("/trackName")
    public void setNameCookie(@RequestParam String name,HttpServletResponse response) throws UnsupportedEncodingException {
        //encode
        name = URLEncoder.encode(name,"UTF-8");
        //create a Cookie object
        Cookie cookie = new Cookie("username", name);
        //set cookie lifecycle
        cookie.setMaxAge(7*24*60*60);
        //add the Cookie object to Response object
        response.addCookie(cookie);
    }
    private String switchOtherPage(String filePath){
        try {
            return Files.readString(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
            return "Error reading HTML file";
        }
    }

}
