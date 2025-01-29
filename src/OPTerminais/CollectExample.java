package OPTerminais;

import java.util.List;
import java.util.stream.Collectors;

public class CollectExample {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> pares = numeros.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toUnmodifiableList());
        System.out.println("Numeros pares: " + pares);
    }
}
//Agrupa ou transforma elementos do fluxo
// em uma coleção ou estrutura final