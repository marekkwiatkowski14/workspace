package day2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serv5")
public class serv5 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public serv5() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append("company :<br/>");
		response.getWriter().append("	-coderslab <br/>");
		response.getWriter().append("learn :<br/>");
		response.getWriter().append("	-php <br/>");
		response.getWriter().append("	-java <br/>");
		response.getWriter().append("	-ruby <br/>");
		response.getWriter().append("	-python <br/>");
		
	}



}
