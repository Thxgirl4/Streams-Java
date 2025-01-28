package OPIntermediarias;

import java.util.List;

public class TestSkip {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> ignorados = numeros.stream()
                .skip(5) //ignora os 5 primeiros numeros
                .toList();

        System.out.println("Após ignorar os 5 primeiros: " + ignorados);
    }
}
