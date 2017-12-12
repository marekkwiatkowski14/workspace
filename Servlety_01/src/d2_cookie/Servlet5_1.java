package d2_cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet5_1")
public class Servlet5_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet5_1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		Cookie newcookie = new Cookie("str1", "odwiedzona");
		response.getWriter().append("<a href=\"http://localhost:8080/Servlety_01/Servlet5_2\">Srevlet5_2</a>");
		response.addCookie(newcookie);
		String text = request.getParameter("dupa");
		if (text!=null) {
			response.getWriter().append(text);
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
