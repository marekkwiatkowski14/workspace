package day2;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serv3")
public class serv3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public serv3() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html;charset=UTF-8");
		try {
			int width = Integer.parseInt(request.getParameter("width"));
			int heigth = Integer.parseInt(request.getParameter("heigth"));
			int [][] tab = new int[heigth][width];
			for (int i = 1; i < heigth; i++) {
				for (int j =1; j<width; j++) {
					tab[i][j] = i*j;
					response.getWriter().append((char)tab[i][j]);
				}			
			}			
		} catch (NumberFormatException e) {
			response.getWriter().append("tab[10][5]");
		}
	}	

}