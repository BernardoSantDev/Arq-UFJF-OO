package org.example;

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;
    private double peso;

    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public void envelhecer() {
        this.idade++;
    }

    public void crescer(double centimetros) {
        if (this.idade < 21) {
            this.altura += centimetros / 100.0;
        }
    }

    public void ganharPeso(double quilos) {
        if (quilos < 0) {
            throw new IllegalArgumentException("O peso ganho deve ser positivo");
        }
        this.peso += quilos;
    }

    public void perderPeso(double quilos) {
        if (quilos < 0) {
            throw new IllegalArgumentException("O peso perdido deve ser positivo");
        }
        this.peso -= quilos;
    }
}
