package mysql.com;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Person 
{

	public static void main(String[] args) 
	{
		
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/persondb","root","root");
				Statement statement=connection.createStatement();
				statement.execute("insert into Person values(108,'nuthan',23,'male','nuthan')");
				statement.execute("insert into Person values(109,'sachin',23,'male','sachin')");
				connection.close();
				System.out.println("data saved");
			} 
			catch (ClassNotFoundException | SQLException e)
			{
				
				e.printStackTrace();
			}
	}
}