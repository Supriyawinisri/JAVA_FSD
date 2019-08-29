package comm.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import comm.example.factory.MyConnectionfactory;

@WebServlet("/view_league.do")
public class ViewLeagueController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ViewLeagueController() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
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
		PrintWriter pw = response.getWriter();
		Connection connection=MyConnectionfactory.getMySqlConnectionForDB();
		Statement statement = connection.createStatement();
		ResultSet rs = statement.executeQuery("select title,season,year from league");
		if(rs==null) {
			pw.println("<h1>No data to be displayed...Please insert a data</h1>");
		}
		else {
			pw.println("<table border=\"1px;\"><tr><th>Title</th><th>Season</th><th>Year</th></tr>");
			while(rs.next()) {
				pw.println("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getInt(3)+"</td></tr>");
			}
			pw.println("</table>");
		}
	}
}