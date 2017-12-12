package day2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/cookie2")
public class cookie2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public cookie2() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		
		String cookieValue = null;
		for	(Cookie	c : cookies) {
			if ("cookieName".equals(c.getName())) {
				cookieValue	= c.getValue();
			}
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		
		String myCookie = request.getParameter("key");
		String cookieValue = request.getParameter("value");
		int hour = Integer.parseInt(request.getParameter("hour"));
		Cookie newCookie = new Cookie(myCookie, cookieValue);
		newCookie.setMaxAge(3600*hour);
						
		response.addCookie(newCookie);
		
		doGet(request, response);
	}

}
