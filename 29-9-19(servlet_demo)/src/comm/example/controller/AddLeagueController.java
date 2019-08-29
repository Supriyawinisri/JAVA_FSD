package comm.example.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.factory.MyConnectionfactory;
import comm.example.model.League;

/**
 * Servlet implementation class AddLeagueController
 */
@WebServlet("/add_league.do")
public class AddLeagueController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private String title,season,year;
	private int iYear;
	private List<String> errMsgs;   
       
    public AddLeagueController() {
        super();
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
		
		errMsgs=new LinkedList<String>();
		season=request.getParameter("season");
		if(season.equals("unknown"))
		{
			errMsgs.add("please select a valid season.");
		}
		
		year=request.getParameter("year");
		try {
			iYear=Integer.parseInt(year);
			
		} catch (Exception e) {
			// TODO: handle exception
			errMsgs.add("year must be numeric");
		}
		
		
		title=request.getParameter("title");
		if(title.toString().length()<5)
		{
			errMsgs.add("title is too short.");
		}
		
		request.setAttribute("SUCCESS", new League(title, season, iYear));
		request.setAttribute("ERROR", errMsgs);
		RequestDispatcher view=request.getRequestDispatcher("add_league.jsp");
		view.forward(request, response);
		
	}

}
