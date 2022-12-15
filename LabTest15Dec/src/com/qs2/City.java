/*
 * Program: Create an application to retrieve information 
 * (author ID, name, and city) about the authors who are 
 * living in the city where the city name begins with the 
 * letter “S”.
 * 
 * @Author: Dhiraj Kumar
 * @Date: 15/12/2022
 * */

package com.qs2;

//Importing sql packages
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLNonTransientConnectionException;
import java.sql.Statement;

//Declaring class
public class City
{

	// Main Method
	public static void main(String[] args)
			throws ClassNotFoundException, SQLException, SQLNonTransientConnectionException {

		// Declaring Variables
		
		String un = "root";
		String p = "rdhiraj474";

		// Connection Class for make connection with our database
		Connection con = DriverManager.getConnection(url, un, p);
		Statement st = con.createStatement();

		// SQL query for finding city name.
		String sql = "select * from AuthorDetails where city like '%S'";

		// ResultSet Class used for retrieve data from database.
		ResultSet rs = st.executeQuery(sql);
		while (rs.next()) 
		{
			System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		con.close();

	}// Main Method Ends
}// Class Ends