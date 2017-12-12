package MVC;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet2")
public class servlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public servlet2() {
        super();        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		int start = Integer.parseInt(request.getParameter("start"))+10;
		int end =Integer.parseInt(request.getParameter("end"))+10;		
		int [] tab = new int[end-start];
		for (int i=0; i<tab.length; i++) {
			tab[i] =start++;
		}		
		request.setAttribute("newtab", Arrays.toString(tab));
		getServletContext().getRequestDispatcher("/day4/serv2.jsp")
		.forward(request, response);
		
	}

}
