package com.example.demo.user;

import com.example.demo.user.User;
import com.example.demo.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    Iterable<User> getUsers()
    {
        return this.userService.getUsers();
    }

    @PostMapping("/users")
    void addUser(@RequestBody User user)
    {
        this.userService.PostUser(user);
    }
}
