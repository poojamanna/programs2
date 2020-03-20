package daoimpl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import dao.PersonDao;
import entity1.Person;
import utility.ConnectionFactory;

public class PersonDaoImpl implements PersonDao{
	Connection con = null;
	Statement s1=null;
	Statement s2 = null;
	ResultSet resultSet = null;
	private Connection getConnection() throws SQLException{
		Connection conn;
		conn = ConnectionFactory.getInstance().getConnection();
				return conn;
	}
	public List<Person> getAllPerson()
	{
		List<Person> listOfPerson = new ArrayList<Person>();
		try
		{
			con=getConnection();
			String query = "select * from Person";
			s1=con.createStatement();
			ResultSet rs = s1.executeQuery(query);
			while(rs.next())
			{
				int tempId=rs.getInt(1);
				String tempName = rs.getString(2);
				String tempEmail=rs.getString(3);
				String tempDob = rs.getString(4);
				long tempPhone = rs.getLong(5);
				String tempAddress = rs.getString(6);
				listOfPerson.add(new Person(tempId,tempName,tempEmail,tempDob,tempPhone,tempAddress));
			}
		}catch(Exception e)
		{
		}
		return listOfPerson;
	}
	

}
