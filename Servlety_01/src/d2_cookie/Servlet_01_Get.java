package d2_cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_01_Get")
public class Servlet_01_Get extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet_01_Get() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		String cookievalue = null;
		for(Cookie c : cookies){
			if("user".equals(c.getName())){
				cookievalue = c.getValue();
				response.getWriter().append(cookievalue);
			} else {
				response.getWriter().append("Ciasteczko o podanej nazwie nie istniej");
			}
		}
	}

}
