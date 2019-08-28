package comm.example.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.dao.UserDetails;
import comm.example.dao.UserDetailsImpl;

@WebServlet("/add_user.do")
public class AddUserDetailsServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    private String name, password, email, country;
	
    public AddUserDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		List<String> err = new LinkedList<String>();
		name = request.getParameter("name");
		password = request.getParameter("password");
		email = request.getParameter("email");
		country = request.getParameter("country");
		UserDetails user = new UserDetailsImpl();
		user.addUserDetails(name, password, email, country);
	}

}
