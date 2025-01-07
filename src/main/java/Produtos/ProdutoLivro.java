package Produtos;

public class ProdutoLivro extends Produtos {

    public double calcularPreco() {
        return (this.getPrecoBase() * 0.95);
    }

}
