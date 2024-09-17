package generics.set.application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        
        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        for (String product : set) {
            System.out.println(product);
        }

        System.out.println("---------------------treeSet---------------------");

        Set<Integer> setIntegersA = new HashSet<>(Arrays.asList(0,2,4,5,6,8,10));
        Set<Integer> setIntegersB = new HashSet<>(Arrays.asList(5,6,7,8,9,10));

        //union
        Set<Integer> setIntegersC = new HashSet<>(setIntegersA);
        setIntegersC.addAll(setIntegersB);
        System.out.println(setIntegersC);

        //intersection
        Set<Integer> setIntegersD = new HashSet<>(setIntegersA);
        setIntegersD.retainAll(setIntegersB);
        System.out.println(setIntegersD);

        //difference
        Set<Integer> setIntegersE = new HashSet<>(setIntegersA);
        setIntegersE.removeAll(setIntegersB);
        System.out.println(setIntegersE);

    }
}
