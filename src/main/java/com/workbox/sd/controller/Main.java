package com.workbox.sd.controller;

import com.workbox.sd.entity.ChanelAngle;
import com.workbox.sd.entity.Orders;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("primary");
        EntityManager manager = factory.createEntityManager();

        manager.getTransaction().begin();

//        manager.persist(new ChanelAngle("[20", 18.4, 12.0, 20000, 350.27));
//        manager.persist(new ChanelAngle("[22", 21.0, 12.0, 20000, 402.85));
//        manager.persist(new ChanelAngle("[24", 24.0, 12.0, 20000, 459.80));
//          manager.persist(new Orders()
//        );

        System.out.println("Good connections");

        manager.getTransaction().commit();
        manager.close();
        factory.close();
    }
}
