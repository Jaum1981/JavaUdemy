package application;

import dominio.Pessoa;

public class Program {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa(1, "Jaum", "Jaum@email.com");
        Pessoa pessoa2 = new Pessoa(2, "Maria", "maria@email.com");
        System.out.println(pessoa);
        System.out.println(pessoa2);
    }
}
