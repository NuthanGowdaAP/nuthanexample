package com.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Hospital 
{

	public static void main(String[] args)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb","root","root");
			PreparedStatement preparedstatement=connection.prepareStatement("insert into hospital values(?,?,?,?)");
			preparedstatement.setInt(1,105);
			preparedstatement.setString(2,"appollo");
			preparedstatement.setString(3,"www.appallo.com");
			preparedstatement.setString(4,"banglore");
			preparedstatement.execute();
			connection.close();
			System.out.println("data saved");
			
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			
			e.printStackTrace();
		}

	}

}
