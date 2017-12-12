package d2_sesje;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Servlet_002")
public class Servlet_002 extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public Servlet_002() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().append
		("<form>"
				+ "ocena<input type=\"text\" name=\"mark\">"
				+ "<input type=\"submit\" value=\"Wyślij\">"
				+ "</form>");
		HttpSession sess = request.getSession();
		int mark = Integer.parseInt(request.getParameter("mark"));
		System.out.println(mark);
//		sess.setAttribute("marks", mark);
		int[] tab = (int[]) sess.getAttribute("marks");
//		System.out.println(Arrays.toString(tab));
		int sum = 0;
		
		if (mark>0&&mark<7) {
			if(sess.getAttribute("marks")==null){
				tab = new int[] {mark};
			} else {
				tab = newtab(tab, mark);	
			}
		}
//		System.out.println(Arrays.toString(tab));
		double medium = Arrays.stream(tab).sum()/tab.length;
//		System.out.println(medium);
		sess.setAttribute("marks", tab);
		response.getWriter().append(Arrays.toString(tab));
		if (tab!=null) {
			response.getWriter().append(medium+"");
		}	
	}
	
	public int[] newtab(int[] marks, int mark) {
		int[] newt = Arrays.copyOf(marks, marks.length+1);
		newt[marks.length] = mark;
		return newt;
	}
	
}
