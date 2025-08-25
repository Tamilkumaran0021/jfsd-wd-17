package com.example.spring_security_demo.controller;

import com.example.spring_security_demo.dto.LoginDto;
import com.example.spring_security_demo.dto.TodoDto;
import com.example.spring_security_demo.entity.Todo;
import com.example.spring_security_demo.service.TodoService;
import com.example.spring_security_demo.util.JwtUtil;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/todos")
@AllArgsConstructor
public class TodoController {
    private TodoService todoService;
    private AuthenticationManager authenticationManager;
    private JwtUtil jwtUtil;

    @PostMapping("login")
    public ResponseEntity<String> login(@RequestBody LoginDto loginDto) {
        UsernamePasswordAuthenticationToken token = new UsernamePasswordAuthenticationToken(loginDto.getUsername(), loginDto.getPassword());
        authenticationManager.authenticate(token);
        String jwt = jwtUtil.generate(loginDto.getUsername());
        return ResponseEntity.ok(jwt);
    }

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
