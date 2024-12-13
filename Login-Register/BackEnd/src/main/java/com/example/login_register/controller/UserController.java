package com.example.login_register.controller;

import com.example.login_register.model.User;
import com.example.login_register.service.interfaces.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping(path="/add")
    public User addUser (@RequestBody User user) {
        return userService.addUser(user);
    }

    @GetMapping(path="/getall")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping(path = "/getuser/{id}")
    public ResponseEntity<User> getUserById(@PathVariable Long id){
        User user = userService.getUserById(id);
        return user != null ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    @PutMapping(path = "/getuser/{id}")
    public ResponseEntity<User> updateUser(@PathVariable Long id, @RequestBody User userDetails){
        User updatedUser = userService.updateUser(id, userDetails);
        return updatedUser != null ? ResponseEntity.ok(updatedUser) : ResponseEntity.notFound().build();
    }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id){
        userService.deleteUserById(id);
        return ResponseEntity.noContent().build();
    }
}
