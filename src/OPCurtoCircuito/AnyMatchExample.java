package OPCurtoCircuito;

import java.util.List;

public class AnyMatchExample {
    public static void main(String[] args) {
        List<String> nomes = List.of("Ana", "Breno", "Caio", "Dante");
        boolean temNomeComA = nomes.stream().anyMatch(nome -> nome.startsWith("A"));
        System.out.println("Algum nome começa com 'A'? " + temNomeComA); //Verifica se algum elemento satisfaz o predicado
    }
}
