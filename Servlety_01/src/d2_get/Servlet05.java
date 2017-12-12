package d2_get;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet05")
public class Servlet05 extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Servlet05() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Map<String, String[]> map = request.getParameterMap();
		Set<String> set = map.keySet();
		for (String key : set) {
			String[] str = map.get(key);
			response.getWriter().append("<p>"+key+":</p>");
			for (String val : str){
				response.getWriter().append("<p>"+ val +"</p>");
			}
		}

	}

}
