package com.example.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.dominio.Pessoa;

public class Program {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(null, "Jaum", "jaum@email.com"); // null pq o proprio bd instancia
        Pessoa pessoa2 = new Pessoa(null, "Maria", "maria@email.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        // para opercao diferente de uma simples leitura, o jpa requer uma transacao
        em.getTransaction().begin();
        em.persist(pessoa);
        em.persist(pessoa2);
        em.getTransaction().commit();

        System.out.println("pronto");
    }
}
