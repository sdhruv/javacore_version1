package com.digitek.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root", "Shar1308");
		Statement st = con.createStatement();
		//i am deleting the row where the id is "6"
		String query = "delete from Customer where Id = ?";
		PreparedStatement preparedStmt = con.prepareStatement(query);
		preparedStmt.setInt(1, 6);
		preparedStmt.execute();
		con.close();
					
		}
		catch(Exception e) {
			System.err.println("Got an Exception!");
			System.err.println(e.getMessage());
		}
		
		
	}
	
	public static void createCustomer() {
		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root", "Shar1308");
		Statement st = con.createStatement();
		String sql = "CREATE DATABASE CUSTOMER1";
		st.executeUpdate(sql);
				
		}catch (Exception e){
			
		}
		
		System.out.println("Database created successfully! ");
				
	}
	
	public static void updateCustomer() {

		try{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce","root", "Shar1308");
		Statement st = con.createStatement();
		st.executeUpdate("insert into Customer "+ "values (06, 'Saumil', 'Mehta', 'saumil@outlook.com', 'sau2355', curdate(), 6)");
		st.executeUpdate("insert into Customer "+ "values (07, 'Narendra', 'Patel', 'NCP@yahoo.com', 'keya2706', curdate(), 7)");
		st.executeUpdate("insert into Customer "+ "values (08, 'Mayurika', 'Ghelani', 'mayur123@yahoo.com', 'may1308', curdate(), 8)");
		con.close();
		} catch (Exception e){
		
		}
				
		System.out.println("Got an exception! ");
									
	}
	
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{ 	
          //readCustomer();
          //updateCustomer();
          //deleteCustomer();
          createCustomer();
          
		}
		
	

	}




	



