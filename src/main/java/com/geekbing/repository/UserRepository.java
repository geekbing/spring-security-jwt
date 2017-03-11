package com.geekbing.repository;

import com.geekbing.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: bing
 * Date: 2017-03-11 11:05
 * Email: dhuzbb@163.com
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
