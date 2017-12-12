package d2_sesje;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet1_Get")
public class Servlet1_Get extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet1_Get() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession sess = request.getSession();
		if (sess.isNew()){
			response.getWriter().append("Brak wartości w kluczu o podanej nazwie");
		} else {
			sess.setAttribute("counter", (int) sess.getAttribute("counter")+1);
		}
		response.getWriter().append(sess.getAttribute("counter")+"");
		System.out.println(sess.getAttribute("counter"));
	}

}
