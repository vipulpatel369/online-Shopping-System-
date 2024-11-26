package com.user.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.catalina.User;

import com.user.model.user;

public class userDAO {
	
	private String jdbcURL="jdbc:mysql://localhost:30006/userappdb";
	private String jdbcUserName="root";
	private String jdbcPassword="root";
	
	
	private static final String INSERT_USER_SQL="INSERT INTO users"+"(cart,login,email,number,password) VALUES"+"(?,?,?,?,?)";
	private static final String SELECT_USER_BY_ID="SELECT * FROM USERS WHERE ID=?;";
	private static final String SELECT_ALL_USERS="SELECT * FROM USERS;";
	private static final String DELETE_USERS_SQL="DELETE FROM USERS FROM ID=?;";
	private static final String UPDATE_USERS_SQL="IPDATE USERS SET CART=?, LOGIN=?, EMAIL=?, NUMBER=?, PASSWORD=? where ID=?;";
	
	
	public userDAO() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Connection getconnection() 
	{
		
		 Connection connection=null;
		 
		 try 
		 {
			 Class.forName("com.mysql.cj.jdbc.driver");
			 connection=DriverManager.getConnection(jdbcURL, jdbcUserName, jdbcPassword);
		 }
		 catch(SQLException e)
		 {
		 	 e.printStackTrace();
		 }
		 
		 catch(Exception e)
		 {
		 	 e.printStackTrace();
		 }
       return connection;
}
	
	
	public void insertUser(user user) 
	
	{
		userDAO dao=new userDAO();
		
		try(Connection connection=dao.getconnection())
		{
			PreparedStatement preparedstatement=connection.prepareStatement(INSERT_USER_SQL);
			preparedstatement.setString(1, user.getCart());
			preparedstatement.setString(2, user.getLogin());
			preparedstatement.setString(3, user.getEmail());
			preparedstatement.setString(4, user.getNumber());
			preparedstatement.setString(5, user.getPassword());
			
			preparedstatement.executeUpdate();
		}
		 catch(Exception e)
		 {
		 	 e.printStackTrace();
		 }
	}
	
	public user selectUser(int id) {
		User user=new User();
		userDAO dao=new userDAO();
		
		try(Connection connection=dao.getconnection())
		{
			PreparedStatement preparedstatement=connection.prepareStatement(SELECT_USER_BY_ID);
			preparedstatement.setInt(1, id);
			
			ResultSet resultSet=preparedstatement.executeQuery();		
			
		
			while(resultSet.next())
			{
				user.setID(id);
				user.set
				
			}
		}
		
		catch(Exception e)
		 {
		 	 e.printStackTrace();
		 }
	}
}