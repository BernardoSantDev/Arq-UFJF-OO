package gerenciamentoprodutos;


public abstract class Produto {
    private String nome;
    private double precoUnitario;
    private int quantidadeEstoque;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void baixarEstoque(int quantidade) {
        if (quantidade > quantidadeEstoque) {
            throw new IllegalArgumentException("Estoque insuficiente.");
        }
        this.quantidadeEstoque -= quantidade;
    }

    public abstract double calcularPreco(int quantidade);
}
