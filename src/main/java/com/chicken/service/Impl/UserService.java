package com.chicken.service.Impl;

import javax.inject.Inject;

import com.chicken.DAO.IUserDAO;
import com.chicken.model.UserModel;
import com.chicken.service.IUserService;

public class UserService implements IUserService {

	@Inject
	private IUserDAO iuserDao ;
	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String username, String password, Integer status) {
		return iuserDao.findByUserNameAndPasswordAndStatus(username, password, status);
	}


}
