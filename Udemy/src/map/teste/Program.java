package map.teste;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Program {
    public static void main(String[] args) {
        
        /*
        
        Métodos do MAP:
            put(key, value)
            remove(key)
            contaisKey(key)
            get(key)
        É baseado em equals e hashCode
        Se equals e hashCode não existir, é usada comparação de ponteiros

            clear()
            size()

            keySet() - retorna um Set<K>
            vales() - retorna um Collection<V>

         */

         Map<String, String> mapString = new TreeMap<>();


        mapString.put("userName", "Maria");
        mapString.put("userEmail", "maria@email.com");
        mapString.put("userPhone", "40028922");

        mapString.remove("userEmail");

        mapString.put("userPhone", "940028922");

        System.out.println("Contains 'userPhone' key: " + mapString.containsKey("userPhone"));

        System.out.println("dados: ");
        for (String key : mapString.keySet()) {
            System.out.println(key +": "+mapString.get(key));
        }

        Map<Product, Double> stock = new HashMap<>();

        Product prod1 = new Product("Notebook", 2180.00);
        Product prod2 = new Product("Tablet", 1180.00);
        Product prod3 = new Product("TV", 2900.00);

        stock.put(prod1, 20000.0);
        stock.put(prod2, 15000.0);
        stock.put(prod3, 10000.0);

        Product ps = new Product("Notebook", 2180.0);

        //sem o hashCode e equals da false
        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));

    }
}
