package OPIntermediarias;

import java.util.List;

public class TestMap {
    public static void main(String[] args){
        List<String> nomes = List.of("Ana", "Bruno", "Roger");
        List<Integer> tamanhos = nomes.stream().map(String ::length).toList();
        System.out.println("Tamanho dos nomes:" + tamanhos);
    }
}
//Transforma cada elemento do fluxo em outro formato usando
// a função fornecida