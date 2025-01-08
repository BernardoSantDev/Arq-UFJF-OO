package gerenciamentoprodutos;

public class ProdutoAlimento extends Produto{
    public double calcularPreco(int quantidade) {
        baixarEstoque(quantidade);
        return getPrecoUnitario() * quantidade;
    }
}
