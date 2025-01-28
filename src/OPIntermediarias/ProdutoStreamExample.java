package OPIntermediarias;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ProdutoStreamExample{
    public static void main(String[] args) {
        List<Produto> produtos = List.of(
                new Produto("Notebook", "Eletronico", 3500.0),
                new Produto("Mouse", "Eletronico", 30.0),
                new Produto("Teclado", "Eletronico", 109.0),
                new Produto("Cadeira Gamer","Moveis", 750.0),
                new Produto("Mesa de Escritorio", "Moveis", 450.0),
                new Produto("Luminaria", "Decoração", 40.0),
                new Produto("Caneca", "Decoração", 25.0));

        Map<String, List<String>> resultado = produtos.stream()
                .filter(produto -> produto.getPreco() > 50)  //filtra produtos com o preço maior que 50
                .collect(Collectors.groupingBy(
                        Produto::getCategoria,
                        Collectors.mapping(
                                produto -> String.format("%s (R$%.2)", produto.getNome(), produto.getPreco()),
                                Collectors.toList()

                        )
                ));
        //Exibir resultado na tela
        System.out.println("Produtos agrupados por categoria");
        resultado.forEach((categoria, itens) -> {
            System.out.println("Categoria: " + categoria.toUpperCase());
            itens.forEach(produto -> System.out.println(produto));
        });

    }
}

