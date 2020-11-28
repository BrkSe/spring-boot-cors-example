package com.burakkutbay.springbootcorsexample.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Burak KUTBAY on 28.11.2020.
 */
@RestController
public class HelloController {
    @CrossOrigin
    @GetMapping("/")
    public String mesaj(){
        return "Merhaba Dünya https://blog.burakkutbay.com";
    }
}
