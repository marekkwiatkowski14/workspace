package MVC;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/servlet1", initParams = {@WebInitParam(name = "exchangerate", value = "4.30")})
public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public servlet1() {
        super();       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		double value = Double.parseDouble(request.getParameter("value"));
		double euro =Double.parseDouble(request.getParameter("exchangerate"));		
		request.setAttribute("zlotys", euro*value);
		getServletContext().getRequestDispatcher("/day4/serv1.jsp")
		.forward(request, response);
	}

}
