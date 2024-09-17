package generics.set.application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Program {
    public static void main(String[] args) {
        
        Set<String> set = new HashSet<>();
        //não garante a ordem
        //LinkedHashSet garante

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        //remove todos que tem pelo menos 3 caracteres
        set.removeIf(x -> x.length()>=3);

        System.out.println(set.contains("Notebook"));

        for (String product : set) {
            System.out.println(product);
        }

        System.out.println("---------------------treeSet---------------------");

        Set<Integer> setIntegersA = new TreeSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> setIntegersB = new TreeSet<>(Arrays.asList(5,6,7,8,9,10));

        //union
        Set<Integer> setIntegersC = new TreeSet<>(setIntegersA);
        setIntegersC.addAll(setIntegersB);
        System.out.println(setIntegersC);

        //intersection
        Set<Integer> setIntegersD = new TreeSet<>(setIntegersA);
        
        setIntegersD.retainAll(setIntegersB);
        System.out.println(setIntegersD);

        //difference
        Set<Integer> setIntegersE = new TreeSet<>(setIntegersA);
        setIntegersE.removeAll(setIntegersB);
        System.out.println(setIntegersE);

    }
}
