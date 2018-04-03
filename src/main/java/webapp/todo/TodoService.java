package webapp.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList<Todo>();

	static {
		todos.add(new Todo("Learn Web Development"));
		todos.add(new Todo("Learn Spring MVC"));
		todos.add(new Todo("Learn Spring Rest Services"));
	}

	public List<Todo> retriveTodos() {
		return todos;
	}

	public void addTodo(String todo) {
		todos.add(new Todo(todo));

	}

	/*
	 * public void deleteTodo(String todo) { Todo td = new Todo(todo); for(Todo
	 * t:todos) { if(t.equals(td)){ todos.remove(td); } }}
	 */
	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}
}
