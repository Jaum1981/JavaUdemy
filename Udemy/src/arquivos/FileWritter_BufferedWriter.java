package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWritter_BufferedWriter {
    public static void main(String[] args) {
        //FileWriter cria/recria um arquivo: new FileWriter(path) / Filwriter(path, true) -> acrescenta ao arquivo

        String[] lines = new String[]{"Arroz", "Goiaba", "Pudim"};
        String path = "/Users/jaum/Desktop/JavaUdemy/Udemy/src/arquivos/out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {

            for (String line : lines) {
                bw.write(line);
                bw.newLine(); // quebra de linha
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {

        }
    }
}
