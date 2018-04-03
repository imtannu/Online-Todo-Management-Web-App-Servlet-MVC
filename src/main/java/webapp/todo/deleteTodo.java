package webapp.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/delete-todo.do")

public class deleteTodo extends HttpServlet {

	TodoService todoService = new TodoService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		// String del = request.getParameter("todo");
		// todoService.deleteTodo(del);

		todoService.deleteTodo(new Todo(request.getParameter("todo")));

		response.sendRedirect("/list-todo.do");

	}

}
