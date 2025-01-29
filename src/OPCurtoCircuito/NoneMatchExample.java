package OPCurtoCircuito;

import java.util.List;

public class NoneMatchExample {
    public static void main(String[] args) {
        List<String> cores = List.of("Azul", "Verde", "Amarillo");
        boolean nenhumaCorcomZ = cores.stream().noneMatch(cor -> cor.startsWith("Z"));
        System.out.println("Nenhuma cor começa com 'Z'? " + nenhumaCorcomZ);
    }
}
//Verifica se nenhum elemento satisfaz o predicado