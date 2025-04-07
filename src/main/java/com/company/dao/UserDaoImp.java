package com.company.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.company.util.DBUtil;

public class UserDaoImp implements UserDao {
	
	public static boolean isValid(String username , String password) {
		
		String query = "select * from user where username = ? and password = ?";
		
		try{ Connection connection = DBUtil.getConnection();
			
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		preparedStatement.setString(1, username);
		preparedStatement.setString(2, password);
		
		ResultSet resultSet = preparedStatement.executeQuery();
		
		System.out.println("Query run Successfully...");
		return resultSet.next();
		
	}catch (Exception e){
		
		e.printStackTrace();
		return false;
		
	}
		}

}
