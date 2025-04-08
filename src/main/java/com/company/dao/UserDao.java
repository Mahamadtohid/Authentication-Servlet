package com.company.dao;

public interface UserDao {

	boolean isValid(String username , String password);
	
	boolean addUser(User user);

}
