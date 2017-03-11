package com.geekbing.controller;

import com.geekbing.entity.Todo;
import com.geekbing.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: bing
 * Date: 2017-03-11 11:25
 * Email: dhuzbb@163.com
 */
@RestController
@RequestMapping("/todos")
@PreAuthorize("hasRole('USER')")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Todo> getAllTodos(@RequestHeader(value = "username") String username) {
        return todoService.findAll(username);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Todo addTodo(@RequestBody Todo addedTodo) {
        return todoService.addTodo(addedTodo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Todo getTodo(@PathVariable Long id) {
        return todoService.findById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Todo updateTodo(@PathVariable Long id, @RequestBody Todo updatedTodo) {
        updatedTodo.setId(id);
        return todoService.update(updatedTodo);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public Todo removeTodo(@PathVariable Long id) {
        return todoService.deleteTodo(id);
    }
}
