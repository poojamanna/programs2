package Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Insert {
	public void insert1()
	{
		
	
	try{
		Scanner sc = new Scanner(System.in);
		String uname = "root";
		String pwd = "1234";
		String url = "jdbc:mysql://localhost:3306/pooja?useSSL=false";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection co = DriverManager.getConnection(url,uname,pwd);
		String q1 = "select max(id) from person";
		Statement s = co.createStatement();
		ResultSet r = s.executeQuery(q1);
	    r.next();
	    int temp = r.getInt(1);
	   
	  
	    System.out.println("number of record u want to enter");
	    int n = sc.nextInt();
	    for(int i=0;i<n;i++)
	    {
	  
	    String name;
	    temp++;
	    System.out.println("enter name");
	    name= sc.next();
	   
	    String q2 = "insert into person(id,name) values ("+temp+",'"+name+"')";
	    System.out.println(q2);
	    Statement s2 = co.createStatement();
	    s2.executeUpdate(q2);
	    System.out.println("inserted a new record");
	   
	    }
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}

}
}

