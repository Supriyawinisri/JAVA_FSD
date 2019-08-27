package comm.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class demopage
 */
@WebServlet("/demopage.view")
public class demopage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public demopage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		process(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		process(request,response);
	}
	protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
//		pw.println("<b>Premiere League</b>");
//		pw.println("<b>Test League</b>");	
//		pw.println("<b>Java League</b>");
		String title = request.getParameter("text-1");
		System.out.println(title);
//		List<Details> list = new ArrayList<Details>();
//		list.add(new Details("FootBall","Summer",2005));
//		list.add(new Details("Baseball","Summer",2007));
//		list.add(new Details("Swimming","Winter",2001));
//		list.add(new Details("Basketball","Autumn",2014));
//		pw.println("<table><tr><th>Sports</th><th>Season</th><th>Year</th></tr>");
//		for(Details l : list) {
//			pw.println("<tr><td>"+l.getTitle()+"</td><td>"+l.getSeason()+"</td><td>"+l.getYear()+"</td></tr>");			
//		}
//		pw.println("</table");
	}

}
