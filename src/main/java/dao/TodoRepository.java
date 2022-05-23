package dao;

import java.util.*;
import dto.Todo;

public class TodoRepository {
	
	private static long currentId = 0;
	
	private List<Todo> todos = new ArrayList<>();
	
	
	private static TodoRepository instance = new TodoRepository();
	
	public static TodoRepository getInstance() {
		return instance;
	}
		
	public List<Todo> getTodos() {
		return todos;
	}
	
	public void addTodo(Todo todo) {
		todo.setId(currentId);
		currentId++;
		todos.add(todo);
	}
	
	public void toggle(long id) {
		for(Todo todo : todos) {
			if(todo.getId() == id) {
				todo.setDone(!todo.isDone());
				break;
			}
		}
	}
}
