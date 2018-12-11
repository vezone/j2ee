package com.Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement; 


public class DBConnection 
{
	Connection m_Connection;
	Statement m_Statement;
	
	public DBConnection() 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			m_Connection = 
					DriverManager
					.getConnection(
							"jdbc:mysql://127.0.0.1:3306/javaee_db?serverTimezone=UTC", 
							"root", 
							"root");
			
			m_Statement	= m_Connection.createStatement();
			
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	public String ExecuteSql()
	{
		ResultSet rSet;
		StringBuilder result = new StringBuilder();
		
		try 
		{
			rSet = m_Statement.executeQuery("SELECT * FROM `javaee_db`.`laba1`;");
		
			while (rSet.next())
			{
				result.append(rSet.getString(1));
				result.append(" ");
				result.append(rSet.getString(2));
				result.append(" ");
				result.append(rSet.getString(3));
				result.append("\n");
			}
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		
		return result.toString();
	}
	
}
