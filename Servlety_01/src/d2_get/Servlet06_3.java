package d2_get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet06_3")
public class Servlet06_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Servlet06_3() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int year = Integer.parseInt(request.getParameter("year"));
		int mix = Integer.parseInt(request.getParameter("mix"));
		int newyear = year+mix;
		response.getWriter().append("Rok to:"+newyear);
	}

}
