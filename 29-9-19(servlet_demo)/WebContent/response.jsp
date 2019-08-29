 <%@page import="comm.example.factory.MyConnectionfactory"%>
<%@ page import="java.sql.*" %>
 
 <body>
 <jsp:useBean id="u" class="comm.example.login.ValidateBean" scope="request">
 <jsp:setProperty name="u" property="*"/> 
 </jsp:useBean>
 You entered user name as <jsp:getProperty name="u" property="user" /> <br>
 You entered user password as <jsp:getProperty name="u" property="pass" /> <br>
<br>
<%
MyConnectionfactory factory = null;
Connection connection=MyConnectionfactory.getMySqlConnectionForDB();
Statement statement = connection.createStatement();
ResultSet rs = statement.executeQuery("select * from login");
int flag= 0;
while(rs.next()){
	if(u.validate(rs.getString("user"), rs.getString("pass"))=="VALID"){
		flag = 1;
	}
}
if(flag == 1){
	RequestDispatcher rd = request.getRequestDispatcher("add_league.jsp");
	rd.forward(request, response);
}else{
	request.setAttribute("ERROR", "Invalid user");
	RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
	rd.forward(request, response);
}
%>
<b>Thank You</b>
</body>