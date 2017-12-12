package d2_cookie;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet5_2")
public class Servlet5_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet5_2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[] cookies = request.getCookies();
		String cookievalue =null;
		if (cookies!=null) {
			for (Cookie c :cookies) {
				if("str1".equals(c.getName())){
					cookievalue = c.getValue();
					c.setMaxAge(0);
					response.addCookie(c);
					response.getWriter().append("Witamy na stronie Servlet5_2");
				}
			}
		} else {
			String text ="Witaj, nie odwiedziłeś jeszcze tej strony";
			request.setAttribute("dupa", text);
			response.getWriter().append(text);
			RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/Servlet5_1");
//			getServletContext().getRequestDispatcher("/Servlet5_1")
			dispatcher.forward(request,response);
			}			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
