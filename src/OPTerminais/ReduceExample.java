package OPTerminais;

import java.util.List;

public class ReduceExample {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int soma = numeros.stream()
                .reduce(0, Integer::sum);
        System.out.println("Soma: " + soma);
    }
}
//Reduz os elementos a um único valor.
// Exemplo: somar todos os números de uma lista.