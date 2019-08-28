package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddUserDeatils
 */
@WebServlet(
		urlPatterns = { "/add_details.php" }, 
		initParams = { 
				@WebInitParam(name = "Country", value = "India,USA,UK,Other")
		})
public class AddUserDeatils extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserDeatils() {
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
		
		out.println("<html><body>");
		
//		@SuppressWarnings("unchecked")
//		List<String> err=(List<String>) request.getAttribute("ERROR");
//		if(err!=null)
//		{
//			for(String s:err)
//			{
//				out.println("<font color='red'>"+s+"</font><br/>");
//			}
//		}
		
		out.println("<form action='add_user.do' method='post' required>");
		out.println("Name: <input type='text' name='name' required><br/>");
		out.println("Password<input type='password' name='password' required><br/>");
		out.println("Email<input type='email' name='email'><br/>");
		String sList=getServletConfig().getInitParameter("Country");
		String arrSList[]=sList.split(",");
		out.println("Country:<select name='country' required><option value='Unknown'>Unknown</option>");
		for(String str:arrSList)
		{
			out.println("<option value='"+str+"'"+">"+str+"</option>");
		}
		
		out.println("</select><br/><input type='submit' value='add league'></form></body></html>");
	}

}
