package org.example;
import java.text.NumberFormat;
import java.util.Locale;


public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private String departamento;

    public Funcionario(String nome, String cargo, double salario, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void receberAumento(double percentual) {
        if (percentual < 0) {
            throw new IllegalArgumentException("O percentual de aumento deve ser positivo");
        }
        this.salario += this.salario * (percentual / 100);
    }

    public void mudarDepartamento(String novoDepartamento) {
        if (novoDepartamento == null || novoDepartamento.isBlank()) {
            throw new IllegalArgumentException("O novo departamento não pode ser vazio");
        }
        this.departamento = novoDepartamento;
    }

    public String exibirDados() {
        NumberFormat format = NumberFormat.getInstance(Locale.US);
        format.setMinimumFractionDigits(2);
        format.setMaximumFractionDigits(2);

        return String.format("Nome: %s, Cargo: %s, Salário: %s, Departamento: %s",
                nome, cargo, format.format(salario), departamento);
    }
}



