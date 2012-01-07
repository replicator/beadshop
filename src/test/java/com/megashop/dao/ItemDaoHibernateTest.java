package com.megashop.dao;

import com.megashop.domain.Item;
import org.springframework.beans.factory.annotation.Autowired;

public class ItemDaoHibernateTest extends BaseDaoTest<Item> {
    @Autowired
    private ItemDao dao;

    @Override
    protected BaseDao<Item> getDao() {
        return dao;
    }

    @Override
    protected Item createInstance() {
        return new Item();
    }
}
