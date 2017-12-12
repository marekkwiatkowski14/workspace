package nowy_projekt;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/test1")
public class test1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public test1() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int first1 = Integer.parseInt(request.getParameter("first"));
		int second2 = Integer.parseInt(request.getParameter("second"));
		response.getWriter().append("res =" + (first1+second2));
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
