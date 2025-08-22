package com.example.spring_security_demo.controller;

import com.example.spring_security_demo.dto.TodoDto;
import com.example.spring_security_demo.entity.Todo;
import com.example.spring_security_demo.service.TodoService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/todos")
@AllArgsConstructor
public class TodoController {
    private TodoService todoService;

//    @PreAuthorize("hasRole(\"ADMIN\")")
    @PostMapping
    public ResponseEntity<TodoDto> addTodo(@RequestBody TodoDto todoDto) {
        TodoDto savedTodo = todoService.addTodo(todoDto);
        return new ResponseEntity<>(savedTodo, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<TodoDto> getTodo(@PathVariable("id") Long id) {
        TodoDto todo = todoService.getTodo(id);
        return new ResponseEntity<>(todo, HttpStatus.OK);
    }
}
