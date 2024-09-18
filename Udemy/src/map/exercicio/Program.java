package map.exercicio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class Program {
    /*
    Na contagem de votos de uma eleição, são gerados vários registros
    de votação contendo o nome do candidato e a quantidade de votos
    (formato .csv) que ele obteve em uma urna de votação. Você deve
    fazer um programa para ler os registros de votação a partir de um
    arquivo, e daí gerar um relatório consolidado com os totais de cada
    candidato. 
    */
    public static void main(String[] args) {
        
        String path = "/home/jaum/Área de Trabalho/JavaUdemy/Udemy/src/map/exercicio/in.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))) {

            Map<String, Integer> votos = new HashMap<>();
            
            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                String candidato = fields[0];
                Integer quantidade = Integer.parseInt(fields[1]);

                //soma dos votos para cada candidato
                votos.put(candidato, votos.getOrDefault(candidato, 0) + quantidade);

                line = br.readLine();
            }
            //print do resultado total para cada candidato
            for (Map.Entry<String, Integer> entry : votos.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
