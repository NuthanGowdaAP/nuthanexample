package com.hospital;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Delete {

	public static void main(String[] args)
{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb","root","root");
			PreparedStatement preparedstatement=connection.prepareStatement("delete from hospital where id=?");
			preparedstatement.setInt(1,101);
			preparedstatement.execute();
			connection.close();
			System.out.println("deleted succesfully");
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}

	}

}
