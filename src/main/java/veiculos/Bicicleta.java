package veiculos;

public class Bicicleta extends Veiculo {
    private double fatorbike;

    public double getFatorbike() {
        return fatorbike;
    }

    public void setFatorbike(double fatorbike) {
        this.fatorbike = fatorbike;
    }

    public double calcularCusto() {
        return getPrecoBase() * fatorbike;
    }
}
