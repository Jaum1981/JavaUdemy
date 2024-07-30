package com.example;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestPersistence {
    public static void main(String[] args) {
        try {
            EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
            System.out.println("EntityManagerFactory created successfully.");
            emf.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
