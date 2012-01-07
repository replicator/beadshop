package com.megashop.dao;

import com.megashop.domain.Item;
import com.megashop.domain.ItemOrder;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

public class OrderDaoHibernateTest extends BaseDaoTest<ItemOrder> {
    @Autowired
    private ItemDao itemDao;
    @Autowired
    private ItemOrderDao itemOrderDao;

    @Test
    public void verifyOrderIsSavedWithRelatedItemAndUserContact() {
        Item item = createItem("Item");
        itemDao.save(item);
        ItemOrder itemOrder = new ItemOrder(item, createUserContact("User"));
        itemOrderDao.saveFlushAndEvict(itemOrder);
        ItemOrder found = itemOrderDao.findById(itemOrder.getId());
        assertThat(found.getItem().getName(), equalTo("Item"));
        assertThat(found.getUserContact().getName(), equalTo("User"));
    }

    @Override
    protected BaseDao<ItemOrder> getDao() {
        return itemOrderDao;
    }

    @Override
    protected ItemOrder createInstance() {
        return new ItemOrder();
    }
}
