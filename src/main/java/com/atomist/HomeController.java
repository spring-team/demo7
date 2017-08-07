package com.atomist;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping(path = "/")
    public String home() {
        return "Hello REST Microservice World";
    }
    
    @RequestMapping(path = "/home2")
    public String home2() {
        return "Hello REST Microservice World";
    }
}
