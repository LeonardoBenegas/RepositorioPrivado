package com.sgh.user.Dao;

import com.sgh.user.model.User;

public interface UserDao {

	 User findbyuserName(String username);
}
