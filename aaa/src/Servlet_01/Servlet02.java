package Servlet_01;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Servlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet02() {
        super();
        
    }
    
    private	String	myParam;
    public	void init(ServletConfig	coderslab)	throws ServletException	{
    	myParam	= coderslab.getInitParameter("myParam");
    	super.init(coderslab);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
