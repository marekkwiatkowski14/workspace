package d2_get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet01")
public class Servlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet01() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {	
		response.setContentType("text/html;charset=UTF-8");
		try{
			int start = Integer.parseInt(request.getParameter("start")) ;
			int end = Integer.parseInt(request.getParameter("end")) ;
			for (int i =start; i<end; i++ ) {
				response.getWriter().append(i+" ");
			}
		} catch (NumberFormatException e) {
			response.getWriter().append("Brak przesłanych zmiennych");
		}		
	}

}
