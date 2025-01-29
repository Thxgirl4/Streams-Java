package OPTerminais;

import java.util.List;

public class ForEachExample {
    public static void main(String[] args){
        List<String> nomes = List.of("Ana", "João", "Sergio");
        nomes.stream().forEach(nome -> System.out.println("olá " + nome + "!"));
    }
}
//Executa uma ação para cada elemento do fluxo