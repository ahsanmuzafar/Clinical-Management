

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class feed
 */
@WebServlet("/feed")
public class feed extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String s1 = request.getParameter("quest1");
		String s2 = request.getParameter("quest2");
		String s3 = request.getParameter("quest3");
		String s4 = request.getParameter("quest4");
		
		fun1(s1);
		fun2(s2);
		fun3(s3);
		fun4(s4);
		
		response.setContentType("text/html");
		PrintWriter o = response.getWriter();
		o.println("<html>");
		o.println("<head> <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
		o.println("<meta http-equiv=\"Refresh\" content=\"3; url=inde.html\"/>");
		
		o.println("</head>");
		
		
		o.println("<body style = \"text-align:center;\">");
		o.println("<p> Thank You </p>");
		//o.println()
		o.println("</body>");
		o.println("</html>");
		o.println("</html>");				

	}
		void fun1(String s)
		{
			Connection conn = null;
			Statement stmt = null;
			try{
				
				
				Class.forName ("org.sqlite.JDBC");	
				

				conn = DriverManager.getConnection("jdbc:sqlite:test.db");

				stmt = conn.createStatement();
				
				if(s.compareToIgnoreCase("excellent") == 0)
				{
					
					ResultSet rset = stmt.executeQuery("select excellent from Feedback where question = 'How do you rate our Services';");
					int i = rset.getInt("excellent");
					i++;
					stmt.executeUpdate("update Feedback set excellent = " + i + " where question = 'How do you rate our Services';");
					
				}
				else if(s.compareToIgnoreCase("good") == 0)
				{
					
					ResultSet rset = stmt.executeQuery("select good from Feedback where question = 'How do you rate our Services';");
					int i = rset.getInt("good");
					i++;
					stmt.executeUpdate("update Feedback set good = " + i + " where question = 'How do you rate our Services';");
					
				}
				else if(s.compareToIgnoreCase("satisfactory") == 0)
				{
					
					ResultSet rset = stmt.executeQuery("select satisfactory from Feedback where question = 'How do you rate our Services';");
					int i = rset.getInt("satisfactory");
					i++;
					stmt.executeUpdate("update Feedback set satisfactory = " + i + " where question = 'How do you rate our Services';");
					
				}
				else if(s.compareToIgnoreCase("don't know") == 0)
				{
					
					ResultSet rset = stmt.executeQuery("select dknow from Feedback where question = 'How do you rate our Services';");
					int i = rset.getInt("dknow");
					i++;
					stmt.executeUpdate("update Feedback set dknow = " + i + " where question = 'How do you rate our Services';");
					
				}
				conn.close();
				stmt.close();
							
			}
			
			catch(Throwable e)
			{
				System.out.println(e.getMessage());
			}

			
		}
		void fun2(String s)
		{
			Connection conn = null;
			Statement stmt = null;
			try{
				
				
				Class.forName ("org.sqlite.JDBC");	
				

				conn = DriverManager.getConnection("jdbc:sqlite:test.db");

				stmt = conn.createStatement();
				
				if(s.compareToIgnoreCase("excellent") == 0)
				{
					
					ResultSet rset = stmt.executeQuery("select excellent from Feedback where question = 'What are you feeling after visiting this clinic';");
					int i = rset.getInt("excellent");
					i++;
					stmt.executeUpdate("update Feedback set excellent = " + i + " where question = 'What are you feeling after visiting this clinic';");
					
				}
				else if(s.compareToIgnoreCase("good") == 0)
				{
					
					ResultSet rset = stmt.executeQuery("select good from Feedback where question = 'What are you feeling after visiting this clinic';");
					int i = rset.getInt("good");
					i++;
					stmt.executeUpdate("update Feedback set good = " + i + " where question = 'What are you feeling after visiting this clinic';");
					
				}
				else if(s.compareToIgnoreCase("satisfactory") == 0)
				{
					
					ResultSet rset = stmt.executeQuery("select satisfactory from Feedback where question = 'What are you feeling after visiting this clinic';");
					int i = rset.getInt("satisfactory");
					i++;
					stmt.executeUpdate("update Feedback set satisfactory = " + i + " where question = 'What are you feeling after visiting this clinic';");
					
				}
				else if(s.compareToIgnoreCase("don't know") == 0)
				{
					
					ResultSet rset = stmt.executeQuery("select dknow from Feedback where question = 'What are you feeling after visiting this clinic';");
					int i = rset.getInt("dknow");
					i++;
					stmt.executeUpdate("update Feedback set dknow = " + i + " where question = 'What are you feeling after visiting this clinic';");
					
				}
				conn.close();
				stmt.close();
							
			}
			
			catch(Throwable e)
			{
				System.out.println(e.getMessage());
			}

			
		}
		void fun3(String s)
		{
			Connection conn = null;
			Statement stmt = null;
			try{
				
				
				Class.forName ("org.sqlite.JDBC");	
				

				conn = DriverManager.getConnection("jdbc:sqlite:test.db");

				stmt = conn.createStatement();
				
				if(s.compareToIgnoreCase("excellent") == 0)
				{
					
					ResultSet rset = stmt.executeQuery("select excellent from Feedback where question = 'Is medical staff is helpful';");
					int i = rset.getInt("excellent");
					i++;
					stmt.executeUpdate("update Feedback set excellent = " + i + " where question = 'Is medical staff is helpful';");
					
				}
				else if(s.compareToIgnoreCase("good") == 0)
				{
					
					ResultSet rset = stmt.executeQuery("select good from Feedback where question = 'Is medical staff is helpful';");
					int i = rset.getInt("good");
					i++;
					stmt.executeUpdate("update Feedback set good = " + i + " where question = 'Is medical staff is helpful';");
					
				}
				else if(s.compareToIgnoreCase("satisfactory") == 0)
				{
					
					ResultSet rset = stmt.executeQuery("select satisfactory from Feedback where question = 'Is medical staff is helpful';");
					int i = rset.getInt("satisfactory");
					i++;
					stmt.executeUpdate("update Feedback set satisfactory = " + i + " where question = 'Is medical staff is helpful';");
					
				}
				else if(s.compareToIgnoreCase("don't know") == 0)
				{
					
					ResultSet rset = stmt.executeQuery("select dknow from Feedback where question = 'Is medical staff is helpful';");
					int i = rset.getInt("dknow");
					i++;
					stmt.executeUpdate("update Feedback set dknow = " + i + " where question = 'Is medical staff is helpful';");
					
				}
				conn.close();
				stmt.close();
							
			}
			
			catch(Throwable e)
			{
				System.out.println(e.getMessage());
			}

			
		}
		void fun4(String s)
		{
			Connection conn = null;
			Statement stmt = null;
			try{
				
				
				Class.forName ("org.sqlite.JDBC");	
				

				conn = DriverManager.getConnection("jdbc:sqlite:test.db");

				stmt = conn.createStatement();
				
				if(s.compareToIgnoreCase("excellent") == 0)
				{
					
					ResultSet rset = stmt.executeQuery("select excellent from Feedback where question = 'How do you rate the skills of our doctors';");
					int i = rset.getInt("excellent");
					i++;
					stmt.executeUpdate("update Feedback set excellent = " + i + " where question = 'How do you rate the skills of our doctors';");
					
				}
				else if(s.compareToIgnoreCase("good") == 0)
				{
					
					ResultSet rset = stmt.executeQuery("select good from Feedback where question = 'How do you rate the skills of our doctors';");
					int i = rset.getInt("good");
					i++;
					stmt.executeUpdate("update Feedback set good = " + i + " where question = 'How do you rate the skills of our doctors';");
					
				}
				else if(s.compareToIgnoreCase("satisfactory") == 0)
				{
					
					ResultSet rset = stmt.executeQuery("select satisfactory from Feedback where question = 'How do you rate the skills of our doctors';");
					int i = rset.getInt("satisfactory");
					i++;
					stmt.executeUpdate("update Feedback set satisfactory = " + i + " where question = 'How do you rate the skills of our doctors';");
					
				}
				else if(s.compareToIgnoreCase("don't know") == 0)
				{
					
					ResultSet rset = stmt.executeQuery("select dknow from Feedback where question = 'How do you rate the skills of our doctors';");
					int i = rset.getInt("dknow");
					i++;
					stmt.executeUpdate("update Feedback set dknow = " + i + " where question = 'How do you rate the skills of our doctors';");
					
				}
				conn.close();
				stmt.close();
							
			}
			
			catch(Throwable e)
			{
				System.out.println(e.getMessage());
			}

			
		}



}
