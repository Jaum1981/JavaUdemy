package arquivos.atividadeProposta;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


// este metodo deu errado ;-;, mas valeu a tentativa

public class Program {
    public static void main(String[] args) {

        String filePath = "/Users/jaum/Desktop/JavaUdemy/Udemy/src/arquivos/atividadeProposta/in.csv";
        String filePathWrite = "/Users/jaum/Desktop/JavaUdemy/Udemy/src/arquivos/atividadeProposta/out/summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePathWrite))) {
                String[] line = null;
                while (br.readLine() != null) {
                    line = br.readLine().split(",");
                    bw.write(line[0]);
                    bw.write(",");

                    double price = Double.parseDouble(line[1]);
                    double amount = Integer.parseInt(line[2]);
                    double total = price * amount;
                    String totalString = Double.toHexString(total);

                    bw.write(totalString);
                    bw.newLine();
                }
            } catch (IOException e) {
                System.out.println("Error writter: " + e.getMessage());
            }
        } catch (IOException e) {
            e.printStackTrace();

        } finally {

        }

    }
}
