

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import java.lang.String.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Servlet implementation class appPatient
 */
@WebServlet("/appointment")
public class appPatient extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws   ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		String name  = request.getParameter("pname");
		String contact = request.getParameter("contact");
		String doctor = request.getParameter("doctor");
		String date = request.getParameter("dat");
		
		String n=new String();
		int i = 0;
		while(doctor.charAt(i) != '(' && i<doctor.length())
		{
			n = n + doctor.charAt(i);
			i++;
		}
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date d = new Date();
        String yourDate = dateFormat.format(d);
        
        
        
        try{
        	
        	Date date1 = dateFormat.parse(yourDate);
        	Date date2 = dateFormat.parse(date);
        	
        	
        	
            if(date2.compareTo(date1) >= 0)
    		{
    			//System.out.println("greater");
            	Connection conn = null;
        		Statement stmt = null;
        		try{
        			
        				Class.forName ("org.sqlite.JDBC");	
        				

        				conn = DriverManager.getConnection("jdbc:sqlite:test.db");

        				stmt = conn.createStatement();
        				String st = "select max(time) from Appointment where doctor = '" + n + "' and date = '" + date + "';";
        				
        				ResultSet rset = stmt.executeQuery(st);
        				
        				
        				if(rset.next())
        				{
        					
        					String time = rset.getString(1);
        					DateFormat sdf = new SimpleDateFormat("hh:mma");
        					Date dd = sdf.parse(time);
        					
        					
        					int hour = dd.getHours();
        					int min = dd.getMinutes();
        					hour = hour % 12;
        					min = min + 15;
        					if(min >= 60)
        					{
        						hour = hour + 1;
        						if(hour > 9)
        						{
        							response.setContentType("text/html");
        							PrintWriter o = response.getWriter();
        							o.println("<html>");
        							o.println("<head> <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
        							o.println("<meta http-equiv=\"Refresh\" content=\"4; url=inde.html\"/>");
        							
        							o.println("</head>");
        							
        							
        							o.println("<body style = \"text-align:center;\">");
        							o.println("<p> Free Slot is not available.Please select another date </p>");
        							//o.println()
        							o.println("</body>");
        							o.println("</html>");
        							o.println("</html>");
        							
        						}
        						min = min % 60;
        					}
        					
        					dd.setHours(hour);
        					dd.setMinutes(min);
        					
        					String s = "0";
        					s = s + hour;
        					s = s + ":";
        					if(min < 10)
        					{
        						s = s + "0";
        					}
        					s = s + min;
        					s = s + "pm";
        					System.out.println(s);
        					rset = stmt.executeQuery("select max(token) from Appointment;");
        					int t;
        					if(rset.next())
        					{
        						String tok = rset.getString(1);
            					t = Integer.parseInt(tok);
            					t = t +1;
        					}
        					else
        					{
        						t = 1;
        					}
        					
        					stmt.executeUpdate("insert into Appointment values(" + t + ",'" + name + "','" + date + "','" + n + "','" + s + "','" + contact + "', 'No');");
        					
        					response.setContentType("text/html");
							PrintWriter o = response.getWriter();
							o.println("<html>");
							o.println("<head> <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
							o.println("<meta http-equiv=\"Refresh\" content=\"60; url=inde.html\"/>");
							
							o.println("</head>");
							
							
							o.println("<body style = \"text-align:center;\">");
							o.println("<p> Your Name : " + name + "</p>");
							o.println("<p> Your Contact No : " + contact + "</p>");
							o.println("<p> Your Doctor : " + doctor + "</p>");
							o.println("<p> Your Token : " + t + "</p>");
							o.println("<p> Your Appointment Time : " + s + "</p>");
							o.println("<p> Date of Appointment : " + date + "</p>");
							o.println("<p> Page will be redirect after 1 minute <br/> <br/>Please note down your details </p>");
							//o.println()
							o.println("</body>");
							o.println("</html>");
							o.println("</html>");
        					stmt.close();
            				conn.close();
            				rset.close();
        				}

        				
        		}
        		catch(Throwable e)
        		{
        			
            		try{
            				stmt.close();
            				conn.close();
            				Connection con;
            				Statement stm;
            			
            				Class.forName ("org.sqlite.JDBC");	
            				

            				con = DriverManager.getConnection("jdbc:sqlite:test.db");
            				stm = con.createStatement();
            				
            				
            				ResultSet rs = stm.executeQuery("select max(token) from Appointment;");
            				
            				int t;
        					//if(rs.next())
        					//{
        						String tk = rs.getString(1);
            					t = Integer.parseInt(tk);
            					t = t +1;
        					//}
        					//else
        					//{
        						//t = 1;
        					//}
            				System.out.println(t);
            				stm.executeUpdate("insert into Appointment values(" + t + ",'" + name + "','" + date + "','" + n + "', '05:00pm'" + ",'" + contact + "', 'No');");
            				//System.out.println("added into db");
            				response.setContentType("text/html");
							PrintWriter o = response.getWriter();
							o.println("<html>");
							o.println("<head> <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
							o.println("<meta http-equiv=\"Refresh\" content=\"60; url=inde.html\"/>");
							
							o.println("</head>");
							
							
							o.println("<body style = \"text-align:center;\">");
							o.println("<p> Your Name : " + name + "</p>");
							o.println("<p> Your Contact No : " + contact + "</p>");
							o.println("<p> Your Doctor : " + doctor + "</p>");
							o.println("<p> Your Token : " + t + "</p>");
							o.println("<p> Your Appointment Time : 05:00pm" +   "</p>");
							o.println("<p> Date of Appointment : " + date + "</p>");
							o.println("<p> Page will be redirect after 1 minute <br/> <br/>Please note down your details </p>");
							//o.println()
							o.println("</body>");
							o.println("</html>");
							o.println("</html>");
            				stm.close();
            				con.close();
            				rs.close();
            				
            		}
            		catch(Throwable z)
            		{
            			
            			System.out.println(z.getMessage());
            		}
        			
        		}
    		}
            else
            {
            	//System.out.println("not");
            	response.setContentType("text/html");
				PrintWriter o = response.getWriter();
				o.println("<html>");
				o.println("<head> <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">");
				o.println("<meta http-equiv=\"Refresh\" content=\"4; url=inde.html\"/>");
				
				o.println("</head>");
				
				
				o.println("<body style = \"text-align:center;\">");
				o.println("<p> Please select valid date </p>");
				//o.println()
				o.println("</body>");
				o.println("</html>");
				o.println("</html>");
            }
        }
        catch(Throwable e)
        {
        	System.out.println(e.getMessage());
        }
		

	}

}
