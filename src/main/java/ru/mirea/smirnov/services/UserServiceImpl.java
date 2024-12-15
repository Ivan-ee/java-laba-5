package ru.mirea.smirnov.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mirea.smirnov.controller.UserController;
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

    @Override
    public UserEntity addUser(UserController.UserRequest request) {
        UserEntity userEntity = new UserEntity();

        userEntity.setEmail(request.getEmail());
        userEntity.setFirstName(request.getFirstName());
        userEntity.setLastName(request.getLastName());
        userEntity.setJob(request.getJob());

        return userDao.createUser(userEntity);
    }
}

