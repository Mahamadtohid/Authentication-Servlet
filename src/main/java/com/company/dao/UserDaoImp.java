package com.company.dao;

//import com.company.dao.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.company.util.DBUtil;

public class UserDaoImp implements UserDao {
	

	@Override
	public boolean isValid(String username , String password){
		String query = "select * from user where username = ? and password = ?";
		
		try{ Connection connection = DBUtil.getConnection();
			
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
//		System.out.println("Query run Successfully...");
		return resultSet.next();
		
//		return true;
		
	}catch (Exception e){
		
		e.printStackTrace();
		return false;
		
		}
	}

	@Override
	public boolean addUser(User user) {
		String query = "INSERT INTO user (username, email, password) VALUES (?, ?, ?)";

		
		try{ Connection connection = DBUtil.getConnection();
		
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, user.getUsername());
		preparedStatement.setString(2, user.getEmail());
		preparedStatement.setString(3, user.getPassword());
		
		int rows = preparedStatement.executeUpdate();
		
		System.out.println("Data  Inserted Successfully");
		
		return rows>0;
		
//		System.out.println("Data  Inserted Successfully");
//		return resultSet.next();
		
//		return true;
		
	}catch (Exception e){
		
		e.printStackTrace();
		return false;
		
		}

	}
	
	
}
