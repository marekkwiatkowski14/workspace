package Servlet_01;

import java.io.IOException;
import java.time.LocalTime;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns	= "/test", initParams =
{@WebInitParam(name	= "myParam", value = "paramValue")})
public class Servlet01 extends HttpServlet {
//	private static final long serialVersionUID = 1L;

//    public Servlet01() {
//        super();
//        
//    }
	
	private	String	myParam;
	public void	init(ServletConfig	config)	throws	ServletException	{
		myParam	= config.getInitParameter("myParam");
		super.init(config);
		
		LocalTime localtime = LocalTime.now();
		System.out.println(localtime);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Date date = new Date();
		response.getWriter().append(date+"");
	}

}
