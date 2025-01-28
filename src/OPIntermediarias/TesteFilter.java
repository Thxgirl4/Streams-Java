package OPIntermediarias;

import java.util.List;

public class TesteFilter {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 8, 10, 12, 15);
        List<Integer> pares = numeros.stream().filter(n -> n % 2 == 0 ).toList();

        System.out.println("Numeros pares: " + pares);
    }
}
//Filtra elementos que satisfazem uma condição específica.
