package comportamentoMemoria;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(); //não aceita tipos primitivos
        list.add("Joao");
        list.add("Maria");
        list.add("Pedro");
        list.add(2, "Mateus");

        System.out.println(list.size());

        // list.remove(1);
        // list.remove("Joao");

        for (String obj : list) { //for each
            System.out.println(obj);
        }

        System.out.println("----------------");

        List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());

        for (String obj : result) { //for each
            System.out.println(obj);
        }

        System.out.println("----------------");

        list.removeIf(x -> x.charAt(0) == 'M'); //funcao lambda(retorna boolean) é um predicado

        for (String obj : list) { //for each
            System.out.println(obj);
        }

        System.out.println(list.size());

        System.out.println("index de Rafael: " + list.indexOf("Rafael")); //sempre retorna -1 quando nao pertence a lista


    }
}
