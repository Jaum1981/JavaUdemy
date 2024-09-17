package set.teste;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {

        Set<String> setStrings = new HashSet<>();
        setStrings.add("TV");
        setStrings.add("Notebook");
        setStrings.add("Tablet");

        //remove do set se a string for maior que 3
        setStrings.removeIf(x -> x.length() > 3);
        for (String s : setStrings) {
            System.out.println(s);
        }

        Set<Integer> set1 = new TreeSet<>(Arrays.asList(2,4,6,8,10,99));
        Set<Integer> set2 = new TreeSet<>(Arrays.asList(1,2,3,5,7,9,10));

        //union
        set1.addAll(set2);
        System.out.println(set1);

        Set<Integer> set3 = new TreeSet<>(Arrays.asList(1,2,3,5,7,9,10));

        //intersection
        set1.retainAll(set3);
        System.out.println(set1);

        Set<Integer> set4 = new TreeSet<>(Arrays.asList(99,90,900,453, 10, 2, 3));

        //diference
        set1.removeAll(set4);
        System.out.println(set1);

        /*
        *
        * Se HasCode e equals estiverem implementados:
        *   * Primeiro hasCode. Se der igual, usa equals para confirmar
        *
        * Se HashCode e equals NÃO estiverem implementados:
        *   * Compara as referências(ponteiros) dos objetos
        *
        * */

        Set<Product> productSet = new HashSet<>();

        productSet.add(new Product("Notebook", 900.0));
        productSet.add(new Product("Tablet", 453.0));
        productSet.add(new Product("TV", 2900.0));

        Product product = new Product("Notebook", 900.0);

        //com hashCode e equals ele da True
        System.out.println(productSet.contains(product));

        for(Product p : productSet) {
            System.out.println(p);
        }

    }
}
