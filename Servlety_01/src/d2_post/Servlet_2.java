package d2_post;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet_2")
public class Servlet_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet_2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		String[] censore = {"dupa", "kurwa", "pajac"};
		String text = request.getParameter("words");
		String [] tab = text.split(" ");
		System.out.println(Arrays.toString(tab));
		StringBuilder sb = new StringBuilder();
		
		
//		for (int i=0; i<tab.length; i++) {
//			for (int j=0; j<censore.length; j++){
//				if (tab[i].equals(censore[j])){
//					tab[i].replace(tab[i], "***");
//				}				
//			}			
//			sb.append(tab[i]+" ");
//			if(tab[i].equals("dupa")){
//				
//			}
//		}
		response.getWriter().append(text.toString());
//		doGet(request, response);
	}

}
