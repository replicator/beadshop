package com.megashop.dao;

import com.megashop.domain.Category;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryDaoHibernateTest extends BaseDaoTest<Category>{
    @Autowired
    private CategoryDao dao;
    @Override
    protected BaseDao<Category> getDao() {
        return dao;
    }

    @Override
    protected Category createInstance() {
        return new Category();
    }
}
