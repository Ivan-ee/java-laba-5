package ru.mirea.smirnov.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.web.bind.annotation.*;
import ru.mirea.smirnov.entity.UserEntity;
import ru.mirea.smirnov.services.UserService;

@RestController
@RequestMapping("/v1/users")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public UserEntity getUserById(@RequestParam int id) {
        return userService.getUser(id);
    }

    @PostMapping
    public UserEntity getUserByJson(@RequestBody UserIdRequest request) {
        return userService.getUser(request.getId());
    }

    @PostMapping("/add")
    public UserEntity addUser(@RequestBody UserRequest request) {
        return userService.addUser(request);
    }

    @Setter
    @Getter
    public static class UserIdRequest {
        private int id;
    }

    @Getter
    @Setter
    public static class UserRequest {
        private String email;
        private String firstName;
        private String lastName;
        private String job;
    }
}

