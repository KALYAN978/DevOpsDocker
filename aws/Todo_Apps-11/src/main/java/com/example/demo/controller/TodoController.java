package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Todo;
import com.example.demo.service.TodoService;

@RestController
public class TodoController {
	
	@Autowired
	private TodoService todoService;
	
	
	@PostMapping("/save")
	public ResponseEntity<?> save(@RequestBody Todo todo)
	{
		return new ResponseEntity<>(todoService.saveTodo(todo),HttpStatus.CREATED);
		
	}
	
	
	@GetMapping("/getAll")
	public ResponseEntity<?> getAllTodo()
	{
		return new ResponseEntity<>(todoService.getAllTodo(),HttpStatus.OK);
		
	}
	

}
