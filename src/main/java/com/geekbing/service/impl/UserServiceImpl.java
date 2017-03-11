package com.geekbing.service.impl;

import com.geekbing.entity.User;
import com.geekbing.repository.UserRepository;
import com.geekbing.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: bing
 * Date: 2017-03-11 13:48
 * Email: dhuzbb@163.com
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @Override
    public User addUser(User addedUser) {
        return userRepository.save(addedUser);
    }

    @Override
    public User getUser(Long id) {
        return userRepository.findOne(id);
    }

    @Override
    public User updateUser(User updatedUser) {
        return userRepository.save(updatedUser);
    }

    @Override
    public User removeUser(Long id) {
        User deletedUser = userRepository.findOne(id);
        userRepository.delete(id);
        return deletedUser;
    }

    @Override
    public User getUserByUsername(String username) {
        return userRepository.findByUsername(username);
    }
}
