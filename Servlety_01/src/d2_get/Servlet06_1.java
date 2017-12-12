package d2_get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet06_1")
public class Servlet06_1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet06_1() {
        super();       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		response.getWriter().append("<a href='/Servlety_01/Servlet06_2?year=1980'> Link do roku 1980 </a><br>");
		response.getWriter().append("<a href='/Servlety_01/Servlet06_2?year=1981'> Link do roku 1981 </a><br>");
		response.getWriter().append("<a href='/Servlety_01/Servlet06_2?year=1982'> Link do roku 1982 </a><br>");
		response.getWriter().append("<a href='/Servlety_01/Servlet06_2?year=1983'> Link do roku 1983 </a><br>");
		response.getWriter().append("<a href='/Servlety_01/Servlet06_2?year=1984'> Link do roku 1984 </a><br>");
		response.getWriter().append("<a href='/Servlety_01/Servlet06_2?year=1985'> Link do roku 1985 </a><br>");
		response.getWriter().append("<a href='/Servlety_01/Servlet06_2?year=1986'> Link do roku 1986 </a><br>");
		response.getWriter().append("<a href='/Servlety_01/Servlet06_2?year=1987'> Link do roku 1987 </a><br>");
		response.getWriter().append("<a href='/Servlety_01/Servlet06_2?year=1988'> Link do roku 1988 </a><br>");
		response.getWriter().append("<a href='/Servlety_01/Servlet06_2?year=1989'> Link do roku 1989 </a><br>");
		response.getWriter().append("<a href='/Servlety_01/Servlet06_2?year=1990'> Link do roku 1990 </a><br>");
		
		
	}

}
