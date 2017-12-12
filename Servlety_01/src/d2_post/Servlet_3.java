package d2_post;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_3")
public class Servlet_3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet_3() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		int a= Integer.parseInt(request.getParameter("a"));
		int b= Integer.parseInt(request.getParameter("b"));
		int c= Integer.parseInt(request.getParameter("c"));
		double x1=0;
		double x2=0;
		double del = b*b-4*a*c;
		if (del>=0) {
			x1=(-b+Math.sqrt(del)/2*a);
			x2=(-b-Math.sqrt(del)/2*a);
			response.getWriter().append("x1="+x1+" x2="+x2);
		} else {
			response.getWriter().append("Dla podanego równania nie ma miejsc zerowych");
		}
		
		
	}

}
