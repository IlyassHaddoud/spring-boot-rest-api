package com.example.demo.user;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Autowired
    ModelMapper modelMapper;

    public Iterable<User> getUsers()
    {
        return this.userRepository.findAll();
    }

    public UserDTO getUserById(int id)
    {
        Optional<User> user = this.userRepository.findById(id);
        UserDTO userDTO = this.modelMapper.map(user,UserDTO.class);
        return userDTO;
    }

    public void PostUser(UserDTO userDTO)
    {
        User user = this.modelMapper.map(userDTO,User.class);
        this.userRepository.save(user);
    }
}
