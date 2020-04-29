package com.springapp;

import com.springapp.User;
import com.springapp.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/user")
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/hello")
    public String hello(){
        return "hello world!";
    }

    @PostMapping
    public void addUser(@RequestBody User user) {
        userService.addUser(user.getId(), user.getName(), user.getSurname());
    }

    @GetMapping
    public String getUser(@PathVariable("Id") long Id){
        return userService.getUser(Id);
    }

    @DeleteMapping(path = "{Id}")
    public void removeUser(@PathVariable("Id") long Id){
        userService.removeUser(Id);
    }


}
