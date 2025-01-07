package Produtos;

public class ProdutoEletronico extends Produtos {

    public double calcularPreco() {
        return (this.getPrecoBase() * 0.90);
    }
}
