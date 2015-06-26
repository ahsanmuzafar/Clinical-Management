

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
/**
 * Servlet implementation class reguser
 */
@WebServlet("/registeruser")
public class reguser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String username = request.getParameter("un");
		//String pass = request.getParameter("pw");
		//String eml = request.getParameter("eml");
		//response.getWriter().println(username + " " + pass + " " + eml);
		
		Connection conn;
		Statement stmt;
		try{
			
				Class.forName ("org.sqlite.JDBC");	
				response.getWriter().println("table created");

				conn = DriverManager.getConnection("jdbc:sqlite:test.db");

				stmt = conn.createStatement();


				//System.out.println("Comment the next three code line for 2nd run");
				//Comment the next three for 2nd run
				//int v = stmt.executeUpdate("create table person (id integer, fullname string)");
				stmt.executeUpdate("insert into person values(1, 'Abdullah')");
				stmt.executeUpdate("insert into person values(2, 'Abdul Rahman')");
				response.getWriter().println("table created");

				ResultSet rset = stmt.executeQuery("select * from person");
				while(rset.next())
				{
					// read the result set
					System.out.println("name = " + rset.getString("fullname"));
					System.out.println("id = " + rset.getInt("id"));
				}
				stmt.close();
				conn.close();

				
		}
		catch(Throwable e)
		{
			System.out.println(e.getMessage());
		}
		//finally
		//{
			//try
			//{
				//stmt.close();
				//conn.close();
			//}
			//catch(Throwable e)
			//{
				//System.out.println(e.getMessage());
			//}
		//}


	}

}
