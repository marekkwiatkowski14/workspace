package day2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/post3")
public class post3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public post3() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		double a= Integer.parseInt(request.getParameter("a"));
		double b= Integer.parseInt(request.getParameter("b"));
		double c= Integer.parseInt(request.getParameter("c"));
		double pow=0;
		double del=b*b-4*a*c;
		double sqdel = Math.sqrt(del);
		if (del>=0) {
			double x1= (-b-sqdel)/(2*a);
			double x2= (-b+sqdel)/(2*a);	
			response.getWriter().append(x1 + x2 + "");
		} else {
			response.getWriter().append("Dla podanych wartości nie ma pierwiastków kwadratowych");
		}
		
		
		doGet(request, response);
	}

}
