package day2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serv4")
public class serv4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public serv4() {
        super();       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		int page = Integer.parseInt(request.getParameter("page"));
//		response.getWriter().append(page +"");		
		response.getWriter().append("Dzielniki: <br/>");
		for (int i=1; i<=page; i++) {
			if (page%i == 0) {
				response.getWriter().append(i + "<br/>");
			}
		}
	}

}
