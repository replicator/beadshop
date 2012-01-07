package com.megashop.dao;


import com.megashop.domain.Identifiable;
import com.megashop.domain.Item;
import com.megashop.domain.UserContact;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration( {"classpath:testApplicationContext.xml"})
public abstract class BaseDaoTest<T extends Identifiable> {

    protected abstract BaseDao<T> getDao();
    protected abstract T createInstance();

    @Before
    public void setUp() {
        getDao().deleteAll();
    }

    @Test
    public void verifyItemSaved() {
        T item = createInstance();
        getDao().save(item);
        assertThat(item.getId(), Matchers.<Object>notNullValue());
    }

    @Test
    public void testFindAll() {
        getDao().save(createInstance());
        getDao().save(createInstance());
        getDao().save(createInstance());
        List<T> all = getDao().findAll();
        Assert.assertThat(all.size(), Matchers.equalTo(3));
    }

    protected UserContact createUserContact(String name) {
        UserContact userContact = new UserContact();
        userContact.setName(name);
        return userContact;
    }

    protected Item createItem(String name) {
        Item item = new Item();
        item.setName(name);
        return item;
    }
}
