package OPCurtoCircuito;

import java.util.List;
import java.util.Optional;

public class FindFirstExample {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> primeiro = numeros.stream().findFirst();
        primeiro.ifPresent(valor -> System.out.println("Primeiro número: " + valor));
    }
}
