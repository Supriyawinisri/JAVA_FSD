package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.dao.UserDetails;
import comm.example.dao.UserDetailsImpl;
import comm.example.model.User;

/**
 * Servlet implementation class EditUserDetails
 */
@WebServlet(
		urlPatterns = { "/edit_details.php" }, 
		initParams = { 
				@WebInitParam(name = "Country", value = "India,USA,UK,Other")
		})
public class EditUserDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
	UserDetails service = new UserDetailsImpl();
       
    public EditUserDetails() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		int id = Integer.parseInt(request.getParameter("id"));
		List<User> list=service.edit(id);
		for(User u : list) {
			out.println("<form action='edit_details.do?id="+id+"' method='post' required>");
			out.println("Name: <input type='text' name='name' value='"+u.getUser_name()+"' required><br/>");
			out.println("Password<input type='password' name='password' value='"+u.getPassword()+"' required><br/>");
			out.println("Email<input type='email' name='email' value='"+u.getEmail()+"'><br/>");
			String sList=getServletConfig().getInitParameter("Country");
			String arrSList[]=sList.split(",");
			out.println("Country:<select name='country' required><option value='Unknown'>Unknown</option>");
			for(String str:arrSList)
			{
				out.println("<option value='"+str+"'"+">"+str+"</option>");
			}
			out.println("</select><br/><input type='submit' value='Update'"
					+ "></form></body></html>");
		}
	}	
}