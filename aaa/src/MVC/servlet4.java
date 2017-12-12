package MVC;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet4")
public class servlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public servlet4() {
        super();      
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		getServletContext().getRequestDispatcher("/day4/form.jsp")
		.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		String [] tab = new String[5];
		String title = request.getParameter("title");
		String author = request.getParameter("author");
		String age = 
		
		Book book = new Book(title, author, age);
		
		String title = 
		Strind author =
		int age =
	}

}
