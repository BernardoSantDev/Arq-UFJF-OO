package bancario;

public abstract class ContaBancaria {
    private String numeroConta;
    private double saldo;
    private String titular;

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }


    public void alterarSaldo(double valor) {
        this.saldo += valor;
    }

    public abstract void depositar(double valordep);

    public abstract void sacar(double valorsac);

    public abstract void calcularJuros();
}
