package Produtos;

public class ProdutoRoupa extends Produtos {

    public double calcularPreco() {
        return (this.getPrecoBase() * 0.80);
    }
}
