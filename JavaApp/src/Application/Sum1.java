package Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Sum1 {
public void sum()
{
	try
	{
	
	String usname = "root";
	String pwd = "1234";
	String url = "jdbc:mysql://localhost:3306/pooja?useSSL=false";
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection co = DriverManager.getConnection(url,usname,pwd);
	Scanner sc = new Scanner(System.in);
	String address="bangalore";
	String q = "select sum(id) from person where address='"+address+"'";
	Statement s =  co.createStatement();
	ResultSet rs = s.executeQuery(q);
	while(rs.next())
	{
		
		String add = rs.getString("sum(id)");
		System.out.println(add+" ");

	}
	}catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}
