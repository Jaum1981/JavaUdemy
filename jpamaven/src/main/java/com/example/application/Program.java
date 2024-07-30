package com.example.application;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.example.dominio.Pessoa;

public class Program {
    public static void main(String[] args) {
        // instaciar uma pessoa:
        // Pessoa pessoa = new Pessoa(null, "Jaum", "jaum@email.com"); // null pq o
        // proprio bd instancia
        // Pessoa pessoa2 = new Pessoa(null, "Maria", "maria@email.com");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
        EntityManager em = emf.createEntityManager();

        // salvar no database:
        // para opercao diferente de uma simples leitura, o jpa requer uma transacao
        // em.getTransaction().begin();
        // em.persist(pessoa);
        // em.persist(pessoa2);
        // em.getTransaction().commit();

        // buscar no banco de dados:
        Pessoa p = em.find(Pessoa.class, 2);
        System.out.println(p.getNome() + " " + p.getId());

        /*
         * Um objeto EntityManager encapsula uma conexão com a base de dados e serve
         * para
         * efetuar operações de acesso a dados (inserção, remoção, deleção, atualização)
         * em
         * entidades (clientes, produtos, pedidos, etc.)
         * por ele monitoradas em um mesmo contexto de persistência.
         */

        System.out.println("pronto");
        em.close();
        emf.close();
    }
}
