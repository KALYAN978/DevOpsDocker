package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Todo;
import com.example.demo.repository.TodoRepo;


@Service
public class TodoServiceimpl implements TodoService{
	
	@Autowired
	private TodoRepo todoRepo;

	@Override
	public Todo saveTodo(Todo todo) {
		// TODO Auto-generated method stub
		return todoRepo.save(todo);
	}

	@Override
	public List<Todo> getAllTodo() {
		// TODO Auto-generated method stub
		return todoRepo.findAll();
	}

	@Override
	public Todo getByid(int id) {
		// TODO Auto-generated method stub
		return todoRepo.findById(id).get();
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		Todo todo = todoRepo.findById(id).get();
		todoRepo.delete(todo);
	}

}
