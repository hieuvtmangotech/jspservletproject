package com.chicken.DAO;

import com.chicken.model.UserModel;

public interface IUserDAO extends GenericDAO<UserModel>{
		UserModel findByUserNameAndPasswordAndStatus(String username,String password,Integer status);
	}
