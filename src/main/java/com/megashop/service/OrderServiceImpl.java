package com.megashop.service;

import com.megashop.dao.ItemOrderDao;
import com.megashop.domain.ItemOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class OrderServiceImpl implements OrderService {
    @Autowired
    private ItemOrderDao itemOrderDao;

    @Override
    @Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
    public void saveOrder(ItemOrder itemOrder) {
        itemOrderDao.save(itemOrder);
    }
}
