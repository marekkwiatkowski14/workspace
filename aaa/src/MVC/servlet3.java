package MVC;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet3")
public class servlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/day4/serv3.jsp")
		.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		int isbn = Integer.parseInt(request.getParameter("isbn"));
		Book book = new Book(title, author, isbn);
				
		request.setAttribute("newbook", book);
		getServletContext().getRequestDispatcher("/day4/result.jsp")
		.forward(request, response);
		
	}

}
