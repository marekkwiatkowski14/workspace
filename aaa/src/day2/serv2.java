package day2;

import java.io.IOException;
import java.util.Map;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/serv2")
public class serv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public serv2() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		 Map<String, String[]> allMap = request.getParameterMap();
		 Set<String> setKeys = allMap.keySet();
		 for (String key : setKeys) {
			 String[] strArr = allMap.get(key);
			 for (String val : strArr) {
				 response.getWriter().append("key = " + key + "; val = " + val + " \n");
				
			 }
		 }
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
