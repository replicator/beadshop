package com.megashop.dao;

import com.megashop.domain.Identifiable;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public abstract class BaseDaoHibernate<T extends Identifiable> extends HibernateDaoSupport implements BaseDao<T> {
    @Autowired
    public void init(SessionFactory factory) {
        setSessionFactory(factory);
    }

    public void save(T item) {
        getHibernateTemplate().save(item);
    }

    @SuppressWarnings({"unchecked"})
    public T findById(Long id) {
        return (T) getHibernateTemplate().get(getDomainClass(), id);
    }

    protected abstract Class<T> getDomainClass();

    @SuppressWarnings({"unchecked"})
    public List<T> findAll() {
        return getHibernateTemplate().find("from " + getDomainClass().getName());
    }

    @Override
    public void deleteAll() {
        Query query = getSession().createQuery("delete from " + getDomainClass().getName());
        query.executeUpdate();
    }

    public void saveFlushAndEvict(T item) {
        getHibernateTemplate().save(item);
        getHibernateTemplate().flush();
        getHibernateTemplate().evict(item);
    }
}
