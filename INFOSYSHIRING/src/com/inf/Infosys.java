package com.inf;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Infosys 
{

	public static void main(String[] args)
	{
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/infosyshiring","root","root");
			Statement statement=connection.createStatement();
//			statement.execute("Insert into infosysemp values(101, 'nuthan ',23, 'male' ,9940305437 ,'SSD', 1.0E7)");
//			statement.execute("insert into infosysemp values(102,'sachin',24,'male',9940356437,'MGR',90000.0)");
//			statement.execute("insert into infosysemp values(103,'chandru',25,'male',9940786437,'SSD',80000.0)");
//			statement.execute("insert into infosysemp values(104,'shambu',20 ,'male', 9940786437, 'SSD', 70000.0)");
//			statement.execute("insert into infosysemp values(10,'lakshmi',30,'female',9940786437.'MGR',60000.0)");
//			statement.execute("insert into infosysemp values(106, 'sahana', 50 ,'female',9940786437, 'MGR',50000.0)");
//			statement.execute("insert into infosysemp values(107,'manju' ,40 ,'male' ,9940786437, 'SSD' ,40000.0)");
//			statement.execute("insert into infosysemp values(108,'shariq' ,60, 'male', 9940786437, 'SSD' ,30000.0)");
//			statement.execute("insert into infosysemp values(109 ,'faizan', 60, 'male ',9940786437, 'MGR' ,20000.0)");
//			statement.execute("insert into infosysemp values(110, 'manoj', 60 ,'male', 9940786437, 'SSD' ,10000.0)");
															
			
//			statement.execute(" delete from infosysemp where E_AGE>=60");
			
//			statement.execute("update infosysemp set E_SALARY=E_SALARY+90000  where DESIGNATION='SSD' ");
			
//			statement.executeQuery("select * from infosysemp");
			
			

			ResultSet result=statement.executeQuery("select * from infosysemp where PH_NO like '99%'  and E_GENDER='male'");
			
//			["select * from infosysemp where E_SALARY>50000"]
			
//			["select * from infosysemp where PH_NO like '99%'  and E_GENDER='male'"]
			while(result.next())
			{
				System.out.println("the person details is:" + result.getInt(1) + " "+result.getString(2)+ " "+result.getInt(3) +" "+result.getString(4)+ " "
						+ result.getString(5) + " "+ result.getString(6)+ " "+ result.getDouble(7));
			
			}
			
			
			connection.close();
			System.out.println("data saved");
			
		}
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}

	}

}
