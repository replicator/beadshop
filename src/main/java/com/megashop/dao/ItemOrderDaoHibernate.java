package com.megashop.dao;

import com.megashop.domain.ItemOrder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ItemOrderDaoHibernate extends BaseDaoHibernate<ItemOrder> implements ItemOrderDao {
    @Override
    protected Class<ItemOrder> getDomainClass() {
        return ItemOrder.class;
    }
}
