package com.zwt.controller;

import com.zwt.mapper.userinfoDao;
import com.zwt.pojo.userInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/index")
public class registerController {

    @Autowired
    private userinfoDao userinfoDao;

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/registerHandle")
    public String registerHandle(@RequestParam("username") String username,@RequestParam("password") String password){
        userInfo userinfo=new userInfo();
        userinfo.setUsername(username);
        userinfo.setPassword(password);
        int add =userinfoDao.insertUserinfo(userinfo);

        System.out.println(userinfoDao.selectAll());
        return "redirect:/index.jsp"; //重定向不经过视图解析器带不走东西
    }
}
