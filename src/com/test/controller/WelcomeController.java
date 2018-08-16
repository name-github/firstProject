package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @Author:
 * @Description
 * @Data:$time$ $date$
 */
@Controller
public class WelcomeController {
    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String printtest(ModelMap model){
        model.addAttribute("msg","Spring 3 MVC test");
        return "test";
    }
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String printwelcome(ModelMap model){
        model.addAttribute("msg","Spring 3 MVC hello world");
        return "welcome";
    }

}
