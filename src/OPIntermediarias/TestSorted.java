package OPIntermediarias;

import java.util.List;

public class TestSorted {
    public static void main(String[] args) {
        List<String> nomes = List.of("Carlos", "Breno", "Andre", "Dandara");
        List<String> nomesOrdenados = nomes.stream()
                                            .sorted() // Ordem natural (alfabética)
                                            .toList();

        System.out.println("Nomes em ordem: " + nomesOrdenados);
    }
}
//Classifica os elementos do fluxo.
// Pode ser natural ou com um comparador customizado.