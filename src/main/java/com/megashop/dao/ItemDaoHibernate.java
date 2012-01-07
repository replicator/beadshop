package com.megashop.dao;

import com.megashop.domain.Item;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ItemDaoHibernate extends BaseDaoHibernate<Item> implements ItemDao {
    @Override
    protected Class<Item> getDomainClass() {
        return Item.class;
    }
}
