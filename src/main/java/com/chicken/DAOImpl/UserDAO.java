package com.chicken.DAOImpl;

import java.util.List;

import com.chicken.DAO.IUserDAO;
import com.chicken.mapper.UserMapper;
import com.chicken.model.UserModel;

public class UserDAO extends AbstractDAO<UserModel>  implements IUserDAO{

	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String username, String password, Integer status) {
		StringBuilder sql = new StringBuilder(" SELECT * FROM user AS u ");
		sql.append(" INNER JOIN role AS r ON r.id = u.roleid");
		sql.append(" WHERE username = ? AND password = ? AND status = ?");
		List<UserModel> users = query(sql.toString(), new UserMapper(), username , password, status);
		return users.isEmpty() ? null : users.get(0);
	}

}
