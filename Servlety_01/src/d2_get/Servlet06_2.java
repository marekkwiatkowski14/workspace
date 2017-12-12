package d2_get;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet06_2")
public class Servlet06_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public Servlet06_2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		int l=0;
		int param = Integer.parseInt(request.getParameter("year"));
		while(l<5){
		Random r = new Random();
		int a = r.nextInt(21)-10;		
		response.getWriter().append("<a href='/Servlety_01/Servlet06_3?year="+param+"&mix="+a+"'> Link do roku 1980 </a><br>");	
		l++;
		}
		
	}

}
