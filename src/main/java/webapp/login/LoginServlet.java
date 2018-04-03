package webapp.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
@WebServlet(urlPatterns = "/login.do")

public class LoginServlet extends HttpServlet {

	LoginService service = new LoginService();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		String name = request.getParameter("name");
		String password = request.getParameter("password");

		boolean isValid = service.isUserValid(name, password);

		if (isValid) {
			request.getSession().setAttribute("name", name);
			response.sendRedirect("/list-todo.do");

		} else {
			request.setAttribute("error", "Invalid UserName OR Password!!!");
			request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
		}

	}

}
