package Application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Login {
	public void uLogin(String uname) {
		try {

			String usname = "root";
			String pwd = "1234";
			String url = "jdbc:mysql://localhost:3306/pooja?useSSL=false";
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection co = DriverManager.getConnection(url, usname, pwd);

			String q = "select name from person where name='" + uname + "'";
			Statement s = co.createStatement();
			ResultSet r = s.executeQuery(q);
			if (r.next()) {
				String n = r.getString("name");
				if (n.equals(uname)) {
					System.out.println("user logged in");
				} 
				else {
					System.out.println("invalid user");
					System.exit (0);
				}

			}
			else {
				System.out.println("invalid user");
				System.exit (0);
			}
			

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}