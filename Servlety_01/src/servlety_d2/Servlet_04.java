package servlety_d2;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= "/Servlet_04", initParams={
		@WebInitParam(name="applicationName", value="MyApplicationName")})

public class Servlet_04 extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//    public Servlet_04() {
//        super();
//        // TODO Auto-generated constructor stub
//    }

	private String myParam;
	public void init(ServletConfig config) throws ServletException {
		myParam = config.getInitParameter("applicationName");
		super.init(config);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append(myParam);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
