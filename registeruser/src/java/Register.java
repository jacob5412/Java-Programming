import java.io.*;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Register extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String n=request.getParameter("userName");
		String p=request.getParameter("userPass");
		String e=request.getParameter("userEmail");
		String c=request.getParameter("userCountry");
		
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/JavaJDBC?autoReconnect=true&useSSL=false","root","MyNewPass");
                out.print("Connected successfully!</br>");
		PreparedStatement ps=con.prepareStatement("insert into registeruser values(?,?,?,?)");
		ps.setString(1,n);
		ps.setString(2,p);
		ps.setString(3,e);
		ps.setString(4,c);
		
		int i=ps.executeUpdate();
		if(i>0)
		out.print("You are successfully registered...");
		
			
		}catch (Exception e2) {System.out.println(e2);}
		
		out.close();
	}

}
