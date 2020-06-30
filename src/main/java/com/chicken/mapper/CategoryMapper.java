package com.chicken.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.chicken.model.CategoryModel;

public class CategoryMapper implements RowMapper{

	@Override
	public Object mapRow(ResultSet resultSet) {
		CategoryModel category = new CategoryModel();
		try {
			category.setId(resultSet.getLong("id"));
			category.setName(resultSet.getString("name"));
			category.setCode(resultSet.getString("code"));
			return category;
		} catch (SQLException e) {
			return null;
		}

	}

}
