package Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class AddData {
	public void listRecord()
	{
		try
		{
		
		String usname = "root";
		String pwd = "1234";
		String url = "jdbc:mysql://localhost:3306/pooja?useSSL=false";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection co = DriverManager.getConnection(url,usname,pwd);
		String q = "select * from person";
		Statement s =  co.createStatement();
		ResultSet rs = s.executeQuery(q);
		while(rs.next())
		{
			int id = rs.getInt("id");
			String name = rs.getString("name");
			String email = rs.getString("email");
			String dob = rs.getString("dob");
			long phone = rs.getLong("phone");
			String address = rs.getString("address");
			System.out.println(id+" "+name+" "+email+" "+dob+" "+phone+" "+address);

		}
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}
