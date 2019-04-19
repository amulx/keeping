package com.amu.chen.keeping.controller;

import com.amu.chen.keeping.entity.User;
import com.amu.chen.keeping.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    UserMapper userMapper;

    @GetMapping("getList")
    @ResponseBody
    public List<User> getList(){
        return userMapper.selectAll();
    }

    @GetMapping("index")
    public String index(Model model){
        User user = new User();
        user.setUsername("myname");
        user.setAge(18);
        user.setPassword("mypassword");
        user.setSex(1);
        model.addAttribute("user",user);
        return "user/index";
    }
}
