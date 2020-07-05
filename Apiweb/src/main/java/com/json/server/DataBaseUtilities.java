package com.json.server;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.LinkedHashMap;

public class DataBaseUtilities 
{
	public static Connection connecttoDataBase() throws InstantiationException, IllegalAccessException, ClassNotFoundException
	{
		Connection connection;
		Class.forName("").newInstance();
		try
		{
			connection=DriverManager.getConnection("");
			return connection;
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	return null;
		
	}
	public static LinkedHashMap getDataFromDB(String query)
	{
		Connection con=null;
		LinkedHashMap data=new LinkedHashMap();
		try
		{
			con = connecttoDataBase();
			//executing the query
			ResultSet result=con.createStatement().executeQuery(query);
			ResultSetMetaData resMetaData=result.getMetaData();
			for(int i=0;i<resMetaData.getColumnCount();i++)
			{
				//data.put(resMetaData, getColumnName(i),result,getString(i));
			}
			return data;
		}
		
			catch (Exception e)
			{
				e.printStackTrace();
			}
			
		
		return null;
}
	}


