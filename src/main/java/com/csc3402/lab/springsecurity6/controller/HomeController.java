
package com.csc3402.lab.springsecurity6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("")
public class HomeController {

    @ResponseBody
    @GetMapping("/")
    public String index() {
        return "hello from index";
    }

    @ResponseBody
    @GetMapping("/about")
    public String about() {
        return "About Spring Boot Security";
    }


    @ResponseBody
    @GetMapping("/admin")
    public String admin() {
        return " Admin Page";
    }


}

