package com.geekbing.auth;

import com.geekbing.entity.User;

/**
 * Author: bing
 * Date: 2017-03-11 12:45
 * Email: dhuzbb@163.com
 */
public interface AuthService {

    User register(User userToAdd);

    String login(String username, String password);

    String refresh(String oldToken);

}
