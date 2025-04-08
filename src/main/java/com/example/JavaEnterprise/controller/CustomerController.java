package com.example.JavaEnterprise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/java-enterprise")
public class CustomerController {

    @GetMapping(value = "/")
    public String homePage() {

        return "home";
    }


}
