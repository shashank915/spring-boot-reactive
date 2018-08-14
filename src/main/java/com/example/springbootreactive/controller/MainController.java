package com.example.springbootreactive.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String loadMainPage(ModelMap modelMap){
        System.out.println("Loading Main Page");
        modelMap.put("name","Shashank");
        return "welcome";
    }

}
