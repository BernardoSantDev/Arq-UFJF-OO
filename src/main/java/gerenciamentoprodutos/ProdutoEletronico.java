package gerenciamentoprodutos;

class ProdutoEletronico extends Produto {

    public double calcularPreco(int quantidade) {
        baixarEstoque(quantidade);
        return getPrecoUnitario() * quantidade;
    }
}
