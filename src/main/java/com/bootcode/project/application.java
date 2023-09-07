package com.bootcode.project;

import com.bootcode.project.model.costomer;
import com.bootcode.project.model.order;
import com.bootcode.project.model.vendor;

import java.util.Date;
import java.util.Random;

public class application {
    public static void main(String[] args) {
        System.out.println("Welcome to Java Project!");

        costomer ramesh = new costomer();
        ramesh.setName("Ramesh Biscuitwala");

        costomer suresh = new costomer();
        suresh.setName("Suresh Batliwala");

        vendor haldiram = new vendor();
        haldiram.setVeg(true);
        haldiram.setName("Haldiram Food Cafe");
        haldiram.setAddress("Jagannade Square, Nandanwan, Nagpur");
        haldiram.setContact(8889798);
        haldiram.setId(1);


        order order = new order();
        order.setOrderDate(new Date());
        order.setAmount(500.50);
        order.setDeliveryaddress("KDKCE, CSE Department, " +
                "Lab-200 at evening 6 pm");
        order.setId(93847983);

        // Random
        Random random = new Random();


    }
}