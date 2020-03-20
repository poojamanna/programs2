package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {
 String connectionUrl="jdbc:mysql://localhost:3306/pooja?useSSL=false";
 String dbUser = "root";
 String dbPwd = "1234";
 String driverClassName = "com.mysql.cj.jdbc.Driver";
 private static ConnectionFactory connectionFactory = null;
 private ConnectionFactory()
 {
	 try
	 {
		 Class.forName(driverClassName);
	 }catch(ClassNotFoundException e)
	 {
		 e.printStackTrace();
	 }
 }
 public Connection getConnection() throws SQLException 
 {
	 Connection conn = null;
	 conn = DriverManager.getConnection(connectionUrl,dbUser,dbPwd);
	 return conn;
 }
 public static ConnectionFactory getInstance()
 {
	 if(connectionFactory == null)
	 {
		 connectionFactory = new ConnectionFactory();
	 }
	 return connectionFactory;
 }
}
