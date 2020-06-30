package com.chicken.DAOImpl;

import java.util.List;

import com.chicken.DAO.ICategoryDAO;
import com.chicken.mapper.CategoryMapper;
import com.chicken.model.CategoryModel;

public class CategoryDAO extends AbstractDAO<CategoryModel> implements ICategoryDAO {

	@Override
	public List<CategoryModel> findAll() {
		String sql = " SELECT * FROM category";
		return query(sql, new CategoryMapper());
	}



}
