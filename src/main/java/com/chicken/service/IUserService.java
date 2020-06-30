package com.chicken.service;

import com.chicken.model.UserModel;

public interface IUserService {
	UserModel findByUserNameAndPasswordAndStatus(String username,String password,Integer status);
}
