package com.bootcode.project.model;

import java.util.Date;

public class order {
    int id;

    public String getDeliveryaddress() {
        return deliveryaddress;
    }

    public void setDeliveryaddress(String deliveryaddress) {
        this.deliveryaddress = deliveryaddress;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getRestrauntname() {
        return restrauntname;
    }

    public void setRestrauntname(String restrauntname) {
        this.restrauntname = restrauntname;
    }

    String deliveryaddress;
    Date orderDate;
    double amount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    String restrauntname;
}
