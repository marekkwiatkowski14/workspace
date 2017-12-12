package session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/serv1set")
public class serv1set extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public serv1set() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		Cookie cookie = new Cookie("user", "Nazwa usera");
		cookie.setMaxAge(60*60*24);
		response.addCookie(cookie);
		response.getWriter().append(request.getContextPath());
		
//		HttpSession sess = request.getSession();
//		sess.setAttribute("counter", 0);
		
	}

}
