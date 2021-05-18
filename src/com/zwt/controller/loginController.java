package com.zwt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class loginController {

    @RequestMapping("/login")
    public String login(String username,String password,Model model){
        model.addAttribute("uname",username);
        return "main";
    }

}
