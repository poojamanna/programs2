package Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateData {
 public void Update(String uname)
 {
	 try
	 {
		 String usname = "root";
			String pwd = "1234";
			String url = "jdbc:mysql://localhost:3306/pooja?useSSL=false";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection(url,usname,pwd);
			Statement s =  co.createStatement();
			Scanner sc = new Scanner(System.in);
			String c = sc.next();
			switch(c)
			{
			case "email": System.out.println("enter email");
			String email =sc.next();
			String q1= "update person set email='"+email+"' where name ='"+uname+"' ";
			s.executeUpdate(q1);
			System.out.println("one record updated");
			break;
			case "address": System.out.println("enter address");
			String address =sc.next();
			String q2= "update person set address='"+address+"' where name ='"+uname+"' ";
			s.executeUpdate(q2);
			System.out.println("one record updated");
			break;
			
			}
			
	 }catch(Exception e)
	 {
		 System.out.println(e.getMessage());
	 }
 }
}
