package veiculos;

public class Moto extends Veiculo {
    private double fatormoto ;

    public double getFatormoto() {
        return fatormoto;
    }

    public void setFatormoto(double fatormoto) {
        this.fatormoto = fatormoto;
    }

    public double calcularCusto() {
        return getPrecoBase() * fatormoto;
    }
}
