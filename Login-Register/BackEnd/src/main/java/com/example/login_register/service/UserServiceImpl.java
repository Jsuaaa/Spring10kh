package com.example.login_register.service;

import com.example.login_register.dto.UserDto;
import com.example.login_register.model.User;
import com.example.login_register.respository.UserRepository;
import com.example.login_register.service.interfaces.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    // Constructor
    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User updateUser(Long id, User userDetails){
        User user = userRepository.findById(id).orElse(null);
        if(user != null){
            user.setName(userDetails.getName());
            user.setUserName(userDetails.getUserName());
            user.setEmail(userDetails.getEmail());
            user.setImg(userDetails.getImg());
            user.setPassword(userDetails.getPassword());
            user.setPhone(userDetails.getPhone());
            return userRepository.save(user);
        }
        return null;
    }

    public void deleteUserById(Long id) {
        userRepository.deleteById(id);
    }
}
