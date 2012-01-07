package com.megashop.dao;

import com.megashop.domain.Category;

import java.util.List;

public interface CategoryDao extends BaseDao<Category> {
    List<Category> findAll();
}
