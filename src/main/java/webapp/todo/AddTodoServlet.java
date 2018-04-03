package webapp.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import webapp.todo.TodoService;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/Addtodo.do")

public class AddTodoServlet extends HttpServlet {

	TodoService todoService = new TodoService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.getRequestDispatcher("/WEB-INF/views/Add-todo.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String newTodo = request.getParameter("todo");
		todoService.addTodo(newTodo);

		response.sendRedirect("/list-todo.do");

	}

}
