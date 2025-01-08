package veiculos;

public class Carro extends Veiculo {
    private double fatorcarro;

    public double getFatorcarro() {
        return fatorcarro;
    }

    public void setFatorcarro(double fatorcarro) {
        this.fatorcarro = fatorcarro;
    }

    public double calcularCusto() {
        return getPrecoBase() * fatorcarro;
    }
}
