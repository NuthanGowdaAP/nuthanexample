package com.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class update 
{

	public static void main(String[] args)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb","root","root");
			PreparedStatement preparedstatement=connection.prepareStatement("update  hospital set location=? where id=?");
			
			preparedstatement.setString(1,"mysoor");
			preparedstatement.setInt(2,102);
			preparedstatement.execute();
			connection.close();
			System.out.println("updated succesfully");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			
			e.printStackTrace();
		}
		
	}

}
