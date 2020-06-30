package com.chicken.DAO;

import java.util.List;

import com.chicken.model.CategoryModel;
public interface ICategoryDAO extends GenericDAO<CategoryModel>{
	List<CategoryModel> findAll();
}
