package d2_cookie;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet7")
public class Servlet7 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet7() {
        super();        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		Cookie[] cookies = request.getCookies();
		if (cookies!=null){
			for (Cookie c : cookies) {
				if("name".equals(c.getName())) {
					response.getWriter().append("Cześć "+c.getValue()+". Twoje dane zostały wczytane z ciasteczka");
				} else {
					response.getWriter().append
					("<form action=\"http://localhost:8080/Servlety_01/Servlet7\" method=\"post\">"
							+ "imie<input type=\"text\" name=\"name\"><br>"
							+ "zapamiętaj mnie<input type=\"checkbox\" name=\"zapamietaj\" value=\"zapamietaj\"><br>"
							+ "<input type=\"submit\" value=\"Wyślij\">"
							+ "</form>");
							break;
				} 
			}
		} else {
			response.getWriter().append
			("<form action=\"http://localhost:8080/Servlety_01/Servlet7\" method=\"post\">"
					+ "imie<input type=\"text\" name=\"imie\"><br>"
					+ "zapamiętaj mnie<input type=\"checkbox\" name=\"rem\" value=\"dupa\"><br>"
					+ "<input type=\"submit\" value=\"Wyślij\">"
					+ "</form>");
		}	
//		String name = request.getParameter("imie");
//		response.getWriter().append("Cześć "+name);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		String name = request.getParameter("imie");
		System.out.println(name);
		response.getWriter().append("Cześć "+name);
		String chec = request.getParameter("rem");
		System.out.println(chec);
		if(chec.equals("dupa")) {
			Cookie cookie = new Cookie("name", name);
			cookie.setMaxAge(60*60);
			response.addCookie(cookie);
		}
	}

}
