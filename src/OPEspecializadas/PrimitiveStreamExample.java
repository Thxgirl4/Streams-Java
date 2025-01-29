package OPEspecializadas;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class PrimitiveStreamExample {
    public static void main(String[] args) {
        int sum = IntStream.range(1, 10) //gera numeros do 1 até 9
              .sum();
        OptionalDouble average = DoubleStream.of(1.0, 10.0)
                        .average();

        OptionalInt max = IntStream.range(1, 20)
                .max();

       OptionalInt min = IntStream.range(1, 20)
                       .min();

         System.out.println("Soma: " + sum + " Average:  " + average);
         System.out.println("Max: " + max + " Min: " + min);
    }
}
//sum()→ Calcula a soma dos elementos no fluxo.
//average()→ Calcula o valor médio.
//max()/min() → Recupera o valor máximo ou mínimo.
//summaryStatistics()→ Retorna estatísticas resumidas (contagem, soma, mínimo, média, máximo).
//range(int startInclusive, int endExclusive)→ Gera um intervalo de números.