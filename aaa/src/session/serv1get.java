package session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class serv1get
 */
@WebServlet("/serv1get")
public class serv1get extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public serv1get() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		
		if (sess.getAttribute("counter") == null) {
			response.getWriter().append("Brak atrybutu");
		} else {
			int counter = (int) sess.getAttribute("counter")+1;
			sess.setAttribute("counter",counter);
			response.getWriter().append(counter + "");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
