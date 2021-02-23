package com.disco.javaspringboot.api;

import com.disco.javaspringboot.model.User;
import com.disco.javaspringboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAll() {
        return userService.getAll();
    }

    @PostMapping
    public UUID createUser(@RequestBody User user) {
        return userService.create(user);
    }
}
