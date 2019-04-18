package com.amu.chen.keeping.controller;

import com.amu.chen.keeping.entity.User;
import com.amu.chen.keeping.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    @ResponseBody
    public List<User> list(){
        return userService.queryAll();
    }

    @PostMapping
    @ResponseBody
    public User save(@RequestBody User user){
        System.out.println(user);
        return userService.saveUser(user);
    }

    @PutMapping
    @ResponseBody
    public User Update(@RequestBody User user){
        return userService.saveUser(user);
    }

    @DeleteMapping(value = "/id/{id}")
    public String delete(@PathVariable Long id){
        userService.deleteById(id);
        return "aaa";
    }

    @GetMapping(value = "/id/{id}")
    @ResponseBody
    public User findById(@PathVariable Long id){
        return userService.getById(id);
    }

    @GetMapping(value = "/username/{username}")
    public User findByUserName(@PathVariable String username){
        return userService.getByUserName(username);
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
