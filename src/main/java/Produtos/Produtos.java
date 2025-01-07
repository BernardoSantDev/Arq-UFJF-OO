package Produtos;

public abstract class Produtos {
    private String nome;
    private double precoBase;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPrecoBase(double precoBase) {
        if(precoBase<0){
            throw new IllegalArgumentException("Numero invalido");
        }
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public abstract double calcularPreco();
}
