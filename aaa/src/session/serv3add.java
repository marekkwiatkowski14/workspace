package session;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/serv3add")
public class serv3add extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public serv3add() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("<form action='#' method=POST> <label> Produkt: <input type=text name=key> </label> <label> Wartość: <input type=text name=value> </label> <input type=submit> </form>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();		
		String produkt = request.getParameter("key");
		int ilość = Integer.parseInt(request.getParameter("value"));	
		sess.setAttribute(produkt, ilość);	
//		Map <String, Integer> map = new HashMap<>();
//		map.put(produkt, ilość);
//		sess.getAttribute(map);		
//		doGet(request, response);
	}

}
