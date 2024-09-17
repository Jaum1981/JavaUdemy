package arquivos.atividadeProposta.application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

import arquivos.atividadeProposta.entities.Products;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Products> list = new ArrayList<>();

        String sourceFileStr = "/Users/jaum/Desktop/JavaUdemy/Udemy/src/arquivos/atividadeProposta/in.csv";

        File sourceFile = new File(sourceFileStr);
        String sourceFolderStr = sourceFile.getParent();

        @SuppressWarnings("unused")
        boolean success = new File(sourceFolderStr + "/out").mkdir();
        String targetFileStr = sourceFolderStr + "/out/summary.csv";

        try (BufferedReader br = new BufferedReader(new FileReader(sourceFileStr))) {

            String productsItens = br.readLine();
            while (productsItens != null) {

                String[] campos = productsItens.split(",");
                String name = campos[0];
                double price = Double.parseDouble(campos[1]);
                int amount = Integer.parseInt(campos[2]);

                list.add(new Products(name, price, amount));

                productsItens = br.readLine();
            }

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(targetFileStr))) {

                for (Products item : list) {
                    bw.write(item.getName() + "," + String.format("%.2f", item.getTotalPrice()));
                    bw.newLine();
                }
                System.out.println(targetFileStr + " Escrita concluida");

            } catch (IOException e) {
                System.out.println("Error writing: " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error reading: " + e.getMessage());
        }

        sc.close();

    }

}
