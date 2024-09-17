package generics.genericsDelimitado.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import generics.genericsDelimitado.entities.Products;
import generics.genericsDelimitado.service.CalculationService;

public class Program {
    public static void main(String[] args) {

        String path = "C:\\Users\\juaun\\Desktop\\JavaUdemy\\Udemy\\src\\generics\\genericsDelimitado\\in.csv";
        List<Products> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();
            while (line != null) {
                String[] fields = line.split(",");
                list.add(new Products(fields[0], Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            Products x = CalculationService.max(list);
            System.out.println("Max: " + x);


        } catch (Exception e) {

        }

    }
}
