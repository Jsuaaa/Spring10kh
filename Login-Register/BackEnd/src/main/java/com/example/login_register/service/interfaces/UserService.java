package com.example.login_register.service.interfaces;

import com.example.login_register.dto.UserDto;
import com.example.login_register.model.User;

import java.util.List;

public interface UserService {

    User addUser(User user);
    List<User> getAllUsers();
    User getUserById(Long id);
    User updateUser(Long id, User userDetails);
    void deleteUserById(Long id);

}
