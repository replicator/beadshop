package com.megashop.dao;

import com.megashop.domain.Category;
import org.springframework.stereotype.Repository;

@Repository
public class CategoryDaoHibernate extends BaseDaoHibernate<Category> implements CategoryDao {
    @Override
    protected Class<Category> getDomainClass() {
        return Category.class;
    }
}
