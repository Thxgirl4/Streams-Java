package OPTerminais;

import java.util.List;

public class CountExample {
    public static void main(String[] args) {
        List<String> frutas = List.of("Maçã", "Banana", "Cereja");
        long total = frutas.stream().count();
        System.out.println("Total de frutas: " + total);
    }
}
//Conta quantos elementos há no fluxo