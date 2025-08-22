package com.example.spring_security_demo.service.impl;

import com.example.spring_security_demo.dto.TodoDto;
import com.example.spring_security_demo.entity.Todo;
import com.example.spring_security_demo.repository.TodoRepository;
import com.example.spring_security_demo.service.TodoService;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoServiceImpl implements TodoService {
    private TodoRepository todoRepository;
    private ModelMapper modelMapper;


    @Override
    public TodoDto addTodo(TodoDto todoDto) {
        Todo todo = modelMapper.map(todoDto, Todo.class);
        Todo savedTodo = todoRepository.save(todo);
        return modelMapper.map(savedTodo, TodoDto.class);
    }

    @Override
    public TodoDto getTodo(Long id) {
        Todo todo = todoRepository.findById(id).get();
        return modelMapper.map(todo, TodoDto.class);
    }

    @Override
    public List<TodoDto> getAllTodos() {
        List<Todo> todos = todoRepository.findAll();
        return todos.stream().map(todo -> modelMapper.map(todo, TodoDto.class)).toList();
    }

    @Override
    public TodoDto updateTodo(TodoDto todoDto, Long id) {
        Todo existingTodo = todoRepository.findById(id).get();
        existingTodo.setDescription(todoDto.getDescription());
        existingTodo.setTitle(todoDto.getTitle());
        existingTodo.setCompleted(todoDto.isCompleted());
        Todo savedTodo = todoRepository.save(existingTodo);
        return modelMapper.map(savedTodo, TodoDto.class);
    }

    @Override
    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }

    @Override
    public TodoDto completeTodo(Long id) {
        Todo existingTodo = todoRepository.findById(id).get();
        existingTodo.setCompleted(true);
        Todo savedTodo = todoRepository.save(existingTodo);
        return modelMapper.map(savedTodo, TodoDto.class);
    }

    @Override
    public TodoDto incompleteTodo(Long id) {
        Todo existingTodo = todoRepository.findById(id).get();
        existingTodo.setCompleted(false);
        Todo savedTodo = todoRepository.save(existingTodo);
        return modelMapper.map(savedTodo, TodoDto.class);
    }
}
