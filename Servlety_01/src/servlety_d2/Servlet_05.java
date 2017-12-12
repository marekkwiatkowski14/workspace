package servlety_d2;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_05")
public class Servlet_05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Servlet_05() {
        super();

    }
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Date date = new Date();
		response.getWriter().append(				
				 "<p>Adres IP: "+ InetAddress.getLocalHost().getHostAddress()+"</p>"
				+ "<p>Aktualny czas: "+date+"</p>");
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
