package OPIntermediarias;

import java.util.List;

public class TestDistinct {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1, 2, 2, 3, 3, 4);
        List<Integer> unicos = numeros.stream()
                .distinct() //remove duplicados
                .toList();

        System.out.println("Numeros unicos: " + unicos);
    }
}
//Remove elementos duplicados do fluxo.