package comm.example.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.dao.UserDetails;
import comm.example.dao.UserDetailsImpl;

/**
 * Servlet implementation class DeleteUserDetails
 */
@WebServlet("/delete_details.do")
public class DeleteUserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
    UserDetails service = new UserDetailsImpl();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteUserDetails() {
        super();
        // TODO Auto-generated constructor stub
    }
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
		int id=Integer.parseInt(request.getParameter("id"));
		service.delete(id);
	}

}
