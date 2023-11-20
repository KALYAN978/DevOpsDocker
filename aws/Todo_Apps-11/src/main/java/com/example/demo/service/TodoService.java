package com.example.demo.service;

import java.util.List;

import com.example.demo.entities.Todo;

public interface TodoService {
	public Todo saveTodo(Todo todo);
	
	public List<Todo> getAllTodo();
	
	public Todo getByid(int id);
	public void delete(int id);
	
	

}
