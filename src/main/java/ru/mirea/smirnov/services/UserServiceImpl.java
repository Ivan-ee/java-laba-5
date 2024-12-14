package ru.mirea.smirnov.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirea.smirnov.dao.UserDao;
import ru.mirea.smirnov.entity.UserEntity;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    @Override
    public UserEntity getUser(int id) {
        return userDao.getUserById(id);
    }
}

