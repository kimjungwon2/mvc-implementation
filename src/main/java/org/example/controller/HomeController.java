package org.example.controller;


import org.example.annotation.Controller;
import org.example.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(HttpServletRequest request, HttpServletResponse response){
        return "home";
    }
}
