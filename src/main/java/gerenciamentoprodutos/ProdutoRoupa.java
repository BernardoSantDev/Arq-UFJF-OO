package gerenciamentoprodutos;

public class ProdutoRoupa extends Produto {

    public double calcularPreco(int quantidade) {
        baixarEstoque(quantidade);
        return getPrecoUnitario() * quantidade * 0.90;
    }
}
