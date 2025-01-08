package bancario;

public class ContaPoupanca extends ContaBancaria {
    private double texaJuros;

    public double getTexaJuros() {
        return texaJuros;
    }

    public void setTexaJuros(double texaJuros) {
        this.texaJuros = texaJuros;
    }

    public void depositar(double valordep) {
        if (valordep <= 0){
            throw new IllegalArgumentException("Valor de depósito inválido.");
        }
        alterarSaldo(valordep);
    }


    public void sacar(double valorsac) {
        if (valorsac > getSaldo()){
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        alterarSaldo(-valorsac);
    }


    public void calcularJuros() {
        alterarSaldo(getSaldo() * texaJuros);
    }
}
