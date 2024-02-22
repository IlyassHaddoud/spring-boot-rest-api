package com.example.demo.user;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/users")
    Iterable<User> getUsers()
    {
        return this.userService.getUsers();
    }

    @GetMapping("/users/{id}")
    UserDTO getUserById(@PathVariable("id") int id)
    {
        return this.userService.getUserById((id));
    }

    @PostMapping("/users")
    void addUser(@RequestBody @Valid UserDTO userDTO)
    {
        this.userService.PostUser(userDTO);
    }
}
