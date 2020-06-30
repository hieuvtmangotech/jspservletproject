package com.chicken.service.Impl;

import java.util.List;

import javax.inject.Inject;

import com.chicken.DAO.ICategoryDAO;
import com.chicken.model.CategoryModel;
import com.chicken.service.ICategoryService;

public class CategoryService implements ICategoryService {

	/*
	 * public CategoryService() { categoryDao = new CategoryDAO(); }
	 */
	@Inject
	private ICategoryDAO categoryDao;
 
	@Override
	public List<CategoryModel> findAll() {
		return categoryDao.findAll();
	}

}
