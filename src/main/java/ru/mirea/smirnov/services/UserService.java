package ru.mirea.smirnov.services;

import ru.mirea.smirnov.entity.UserEntity;

public interface UserService {
    UserEntity getUser(int id);
}

