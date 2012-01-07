package com.megashop.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class ItemOrder implements Identifiable {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    private UserContact userContact;
    @OneToOne
    private Item item;
    @Temporal(TemporalType.TIMESTAMP)
    private Date orderDate;

    public ItemOrder() {
        orderDate = new Date();
    }

    public ItemOrder(Item item, UserContact userContact) {
        this.item = item;
        this.userContact = userContact;
        orderDate = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserContact getUserContact() {
        return userContact;
    }

    public void setUserContact(UserContact userContact) {
        this.userContact = userContact;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }
}
