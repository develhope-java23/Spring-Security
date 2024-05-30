package com.example.authorization_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hellos")
public class Controller {



    @GetMapping
    public String hello() {
        return "Hello world";
    }


}
