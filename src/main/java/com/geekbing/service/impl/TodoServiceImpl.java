package com.geekbing.service.impl;

import com.geekbing.entity.Todo;
import com.geekbing.repository.TodoRepository;
import com.geekbing.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: bing
 * Date: 2017-03-11 13:48
 * Email: dhuzbb@163.com
 */
@Service
public class TodoServiceImpl implements TodoService {

    @Autowired
    private TodoRepository todoRepository;

    @Override
    public Todo addTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    @Override
    public Todo deleteTodo(Long id) {
        Todo deletedTodo = todoRepository.findOne(id);
        todoRepository.delete(id);
        return deletedTodo;
    }

    @Override
    public List<Todo> findAll(String username) {
        return todoRepository.findByUserUsername(username);
    }

    @Override
    public Todo findById(Long id) {
        return todoRepository.findOne(id);
    }

    @Override
    public Todo update(Todo todo) {
        return todoRepository.save(todo);
    }
}
