package com.digitek.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CustomerDao {
	
	public static void readCustomer()throws ClassNotFoundException, SQLException{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root", "Shar1308");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from Customer");
			while(rs.next()) {
			int id = rs.getInt("Id");
			String firstName = rs.getString("First_Name");
			String lastName = rs.getString("Last_Name");
			String emailId = rs.getString("Email_Id");
			String password = rs.getString("Password");
			String creationDate = rs.getString("Creation_Date");
			int addressId = rs.getInt("Address_Id");
			System.out.println(id+"---->"+firstName+"----->"+lastName+"----->"+emailId+"----->"+password+"------->"+creationDate+"------->"+addressId);
		}
	}
	

	public static void deleteCustomer() {
		
	}
	
	public static void updateCustomer() {
		
	}
	
	public static void createCustomer() {
		
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{ 	
          readCustomer();
          
          
		}
		
	

	}




	



