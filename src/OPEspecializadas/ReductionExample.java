package OPEspecializadas;

import java.util.stream.IntStream;

public class ReductionExample {
    public static void main(String[] args) {
        int product = IntStream.rangeClosed(1, 5) // [1, 2, 3, 4, 5, 6, 7, 8, 9]
                .reduce(1, (a, b) -> a * b); //Multiplication
        System.out.println("Produto: " + product);
    }

}
//Multiplicando todos os elementos