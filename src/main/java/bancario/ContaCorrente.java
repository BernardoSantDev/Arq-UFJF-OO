package bancario;

public class ContaCorrente extends ContaBancaria {
    private double taxaManutencao;

    public double getTaxaManutencao() {
        return taxaManutencao;
    }

    public void setTaxaManutencao(double taxaManutencao) {
        this.taxaManutencao = taxaManutencao;
    }

    public void depositar(double valordep) {
        if (valordep <= 0){
            throw new IllegalArgumentException("Valor de depósito inválido.");
        }
        alterarSaldo(valordep - taxaManutencao);
    }

    public void sacar(double valorsac) {
        if (valorsac > getSaldo()) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        alterarSaldo(-valorsac);
    }

    public void calcularJuros() {
    }
}
