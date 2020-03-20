package Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Dob {
 public void dob1(String uname)
 {
	 try
		{
		
		String usname = "root";
		String pwd = "1234";
		String url = "jdbc:mysql://localhost:3306/pooja?useSSL=false";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection co = DriverManager.getConnection(url,usname,pwd);
		String q = "select dob from person where name='"+uname+"'";
		Statement s =  co.createStatement();
		ResultSet rs = s.executeQuery(q);
		while(rs.next())
		{
			
			String dob = rs.getString("dob");
			System.out.println(dob+" ");

		}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
 }
}
