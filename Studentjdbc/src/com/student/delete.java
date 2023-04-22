package com.student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class delete
{

	public static void main(String[] args)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb","root","root");
			Statement statement=connection.createStatement();
			statement.execute("insert into Student values(101,'nuthan',23,'male')");
			statement.execute("insert into Student values(102,'sachin',23,'male')");
			connection.close();
			System.out.println("data saved");
		
		}
		catch (ClassNotFoundException | SQLException e) 
		{
		
			e.printStackTrace();
		}

	}

}
