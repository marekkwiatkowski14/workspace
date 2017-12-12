package d2_get;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet04")
public class Servlet04 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Servlet04() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		int page = Integer.parseInt(request.getParameter("page"));
//		response.getWriter().append("Dzielniki: <br/>");
		for (int i=1; i<=page; i++) {
			if (page%i==0) {
				response.getWriter().append(i+" <br/> ");
			}
		}
	
	}
	
//	protected void doGet(HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		int page = Integer.parseInt(request.getParameter("page"));
//
//		response.getWriter().append("Dzielniki: <br/>");
//		for (int i = 1; i < page; i++) {
//			if (page % i == 0) {
//				response.getWriter().append(i + "<br/>");
//			}
//		}
//	}
	
}
