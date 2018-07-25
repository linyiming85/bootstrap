package com.example.demo.controller;

import com.example.demo.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by linyi on 2018/7/25.
 */

@Controller
public class Helloworld {

    @GetMapping("/hello")
    public String hello(Model model){
        model.addAttribute("person",new Person());
        return "hello";
    }

    @PostMapping("/login")
    public String login(@ModelAttribute(value = "person") Person person){


        return "login";
    }

}
