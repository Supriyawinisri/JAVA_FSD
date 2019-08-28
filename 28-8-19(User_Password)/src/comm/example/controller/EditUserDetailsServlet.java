package comm.example.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.dao.UserDetails;
import comm.example.dao.UserDetailsImpl;

/**
 * Servlet implementation class EditUserDetailsServlet
 */
@WebServlet("/edit_details.do")
public class EditUserDetailsServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    private String name, password, email, country;
    private int id;
    UserDetails service = new UserDetailsImpl();
    
    public EditUserDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, SQLException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		id=Integer.parseInt(request.getParameter("id"));
		name=request.getParameter("name");
		password=request.getParameter("password");
		email=request.getParameter("email");
		country=request.getParameter("country");
		service.update(id, name, password, email, country);
		RequestDispatcher view = request.getRequestDispatcher("view_details.php");
		view.forward(request, response);
	}
}
