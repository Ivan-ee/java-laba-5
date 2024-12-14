package ru.mirea.smirnov.dao;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.mirea.smirnov.entity.UserEntity;
import ru.mirea.smirnov.repository.UserRepository;

@Component
@RequiredArgsConstructor
public class UserDao {

    private final UserRepository userRepository;

    public UserEntity getUserById(int id) {
        return userRepository.findById(id).orElseThrow(() ->
                new RuntimeException("User with id " + id + " not found"));
    }

    public UserEntity createUser(UserEntity user) {
        return userRepository.save(user);
    }
}
