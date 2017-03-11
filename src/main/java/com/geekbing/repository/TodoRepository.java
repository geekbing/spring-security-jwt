package com.geekbing.repository;

import com.geekbing.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author: bing
 * Date: 2017-03-11 11:27
 * Email: dhuzbb@163.com
 */
@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

    List<Todo> findByUserUsername(String username);

}
