package d2_sesje;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet_Del")
public class Servlet_Del extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet_Del() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		sess.removeAttribute("counter");
		System.out.println(sess.getAttribute("counter"));
	}
	
}
