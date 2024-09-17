package arquivos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_BufferedReader {
    public static void main(String[] args) {

        String path = "/Users/jaum/Desktop/JavaUdemy/Udemy/src/arquivos/in.txt";
        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr); //é uma abstração maior do fileReader. Tambem deixa a leitura mais rapida por conta do esquema de buffer

            String line = br.readLine(); //retorna nullo caso esteja no final

            while (line != null) {
                System.out.println(line);
                line = br.readLine(); //le novamente a prox linha
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            try { //pode gerar excesao na hora de fechar
                if (br != null) {
                    br.close();
                }
                if (fr != null) {
                    fr.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }
}
