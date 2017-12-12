package servlety_d2;

import java.io.IOException;
import java.time.LocalTime;
import java.util.Date;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.crypto.Data;

@WebServlet("/Servlet_01")
public class Servlet_01 extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//
//    public Servlet_01() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
    

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Date data = new Date();
		System.out.println(data);
		response.getWriter().append(data+"");
	}

}
