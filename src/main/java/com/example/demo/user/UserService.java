package com.example.demo.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public Iterable<User> getUsers()
    {
        return this.userRepository.findAll();
    }

    public void PostUser(User user)
    {
        this.userRepository.save(user);
    }
}
