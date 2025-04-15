package com.example.JavaEnterprise.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/java-enterprise")
public class CustomerController {

    @GetMapping
    public String homePage() {

        return "home";
    }

    @GetMapping(value = "/products")
    public String showAllProdcuts() {

        return "products";
    }
}
