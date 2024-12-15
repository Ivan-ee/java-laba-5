package ru.mirea.smirnov.services;

import ru.mirea.smirnov.controller.UserController;
import ru.mirea.smirnov.entity.UserEntity;

public interface UserService {
    UserEntity getUser(int id);
    UserEntity addUser(UserController.UserRequest request);
}

