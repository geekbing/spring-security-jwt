package com.geekbing.service;

import com.geekbing.entity.User;

import java.util.List;

/**
 * Author: bing
 * Date: 2017-03-11 13:46
 * Email: dhuzbb@163.com
 */
public interface UserService {

    List<User> getUsers();

    User addUser(User addedUser);

    User getUser(Long id);

    User updateUser(User updatedUser);

    User removeUser(Long id);

    User getUserByUsername(String username);
}
