package session;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/serv3all")
public class serv3all extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public serv3all() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		HttpSession sess = request.getSession();
//		String [] tab = sess.getValueNames();
//		response.getWriter().append(Arrays.toString(tab) +"");
		Enumeration e = (Enumeration) (sess.getAttributeNames());
		while (e.hasMoreElements()) {
			Object tring;
			if ((tring = e.nextElement())!=null) {
				System.out.println(sess.getValue((String) tring));
				System.out.println("<br/>");
			}
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		
		doGet(request, response);
	}

}
