package d2_cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet6")
public class Servlet6 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet6() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String color_text = request.getParameter("color_text");
		String color_bg = request.getParameter("color_bg");
		Cookie cookie = new Cookie("color_text", color_text);
		Cookie cookie2 = new Cookie("color_bg", color_bg);
		response.getWriter().append("<body bgcolor=\""+cookie2.getValue()+"\"><font color=\""+cookie.getValue()+"\">dupa</font></body>");
//		response.getWriter().append(color_bg);
		response.addCookie(cookie);
		response.addCookie(cookie2);
	}

}
