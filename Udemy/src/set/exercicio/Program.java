package set.exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Program {

    /*
    Um site de internet registra um log de acessos dos usuários. Um
    registro de log consiste no nome de usuário (apenas uma palavra) e o
    instante em que o usuário acessou o site no padrão ISO 8601,
    separados por espaço, conforme exemplo. Fazer um programa que leia
    o log de acessos a partir de um arquivo, e daí informe quantos usuários
    distintos acessaram o site.
    */

    public static void main(String[] args) {

       String path = "/home/jaum/Área de Trabalho/JavaUdemy/Udemy/src/set/exercicio/in.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            Set<LogEntry> logEntries = new HashSet<>(); //é o mais rápido, e no problema específico não importa a ordem

            String line = br.readLine();

            while (line != null) {

                //recorta a string a cada " "
                String[] fields = line.split(" ");
                //separa o primeiro field como username
                String username = fields[0];
                //separa o segundo como moment(data)
                Date moment = Date.from(Instant.parse(fields[1]));

                logEntries.add(new LogEntry(username, moment));

                line = br.readLine();
            }

            System.out.println("Total users: " + logEntries.size());

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
