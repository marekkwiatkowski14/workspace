package d2_get;

import java.io.IOException;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet03")
public class Servlet03 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public Servlet03() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int width = 5;
		width = Integer.parseInt(request.getParameter("width")) ;
//		height = Integer.parseInt(request.getParameter("height"));
		
		int height = 10;
		
		int [][] tab = new int [width][height];
		int i=0;
		int j=0;
		while (i<height) {
			while (j<width) {
				tab[j][i]=(j+1)*(i+1);				
				j++;
			}
			i++;
		}	
		response.getWriter().append(tab +"");
//	System.out.println(Arrays.toString(tab));
	}
	
}
