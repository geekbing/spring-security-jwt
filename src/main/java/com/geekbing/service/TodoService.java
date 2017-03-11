package com.geekbing.service;

import com.geekbing.entity.Todo;

import java.util.List;

/**
 * Author: bing
 * Date: 2017-03-11 13:23
 * Email: dhuzbb@163.com
 */
public interface TodoService {

    Todo addTodo(Todo todo);

    Todo deleteTodo(Long id);

    List<Todo> findAll(String username);

    Todo findById(Long id);

    Todo update(Todo todo);
}
