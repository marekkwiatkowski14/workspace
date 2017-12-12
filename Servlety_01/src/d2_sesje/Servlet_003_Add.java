package d2_sesje;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet_003_Add")
public class Servlet_003_Add extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet_003_Add() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append
		(" <form action=\"#\" method=\"POST\">"
				+ "<label> "
				+ "Klucz: <input type=\"text\" name=\"key\">"
				+ "</label>"
				+ "<label> "
				+ "Wartość: <input type=\"text\" name=\"value\">"
				+ " </label>"
				+ "<input type=\"submit\">"
				+ " </form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession ses = request.getSession();
		String key = request.getParameter("key");
		String value = request.getParameter("value");
		ses.setAttribute(key, value);
	}

}
