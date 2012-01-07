package com.megashop.dao;

import com.megashop.domain.Identifiable;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;

import java.util.List;

public interface BaseDao<T extends Identifiable> {
    void save(T obj);
    T findById(Long id);
    List<T> findAll();
    void deleteAll();
    void saveFlushAndEvict(T item);
}
