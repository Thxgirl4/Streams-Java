package OPCurtoCircuito;

import java.util.List;
import java.util.Optional;

public class FindAnyExample {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(5, 10, 15, 20, 25, 30);
        Optional<Integer> qualquer = numeros.stream().findAny();
        qualquer.ifPresent(valor -> System.out.println("Numero encontrado: " + valor));
    }
}
