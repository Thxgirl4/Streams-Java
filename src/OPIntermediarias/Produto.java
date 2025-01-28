package OPIntermediarias;

public class Produto {
    private String nome;
    private String categoria;
    private double preco;
    public Produto(String nome, String categoria, double preco) {
        this.nome = nome;
        this.categoria = categoria;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }

    public String getCategoria(){
        return categoria;
    }

    public double getPreco(){
        return preco;
    }

    @Override
    public String toString() {
        return String.format("%s (R$ %.2f)", nome, preco);
    }
}

