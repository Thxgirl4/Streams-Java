package OPIntermediarias;

import java.util.List;

public class TestLimit {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 5, 7, 9, 10);
        List<Integer> limitados = numeros.stream()
                .limit(4) // apenas os 4 primeiros
                .toList();

        System.out.println("Primeiros 4 numeros: " + limitados);
    }
}
//Limita o fluxo a um número máximo de elementos.
