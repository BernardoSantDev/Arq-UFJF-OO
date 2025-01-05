package org.example;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade_estoque;
    private String categoria;

    public Produto(String nome, double preco, int quantidade_estoque, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade_estoque = quantidade_estoque;
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEstoque() {
        return quantidade_estoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade adicionada deve ser positiva");
        }
        this.quantidade_estoque += quantidade;
    }

    public void removerEstoque(int quantidade) {
        if (quantidade < 0) {
            throw new IllegalArgumentException("A quantidade removida deve ser positiva");
        }
        if (quantidade > quantidade_estoque) {
            throw new IllegalArgumentException("Quantidade insuficiente no estoque");
        }
        this.quantidade_estoque -= quantidade;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual < 0 || percentual > 100) {
            throw new IllegalArgumentException("Percentual de desconto inválido");
        }
        this.preco -= this.preco * (percentual / 100);
    }
}
