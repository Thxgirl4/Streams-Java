package OPIntermediarias;

import java.util.List;

public class TestFlatMap {
    public static void main(String[] args) {
        List<List<String>> listaDeListas = List.of( List.of("Transforma cada elemento", "em um fluxo"),
                                                      List.of("de elementos", "e \"achata\""),
                                                      List.of("esses fluxos."));

        List<String> elements = listaDeListas.stream().flatMap(List::stream).toList();
        System.out.println("Elementos achados: " + elements);
    }
}
