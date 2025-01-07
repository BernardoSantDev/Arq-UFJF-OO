package passagens;

public class VooInternacional extends Voo{
    private double fatorPrecoInt;
    private float moeda;

    public double getFatorPrecoInt() {
        return fatorPrecoInt;
    }

    public void setFatorPrecoInt(double fatorPrecoInt) {
        if(fatorPrecoInt<0){
            throw new IllegalArgumentException("Numero invalido");
        }
        this.fatorPrecoInt = fatorPrecoInt;
    }

    public float getMoeda() {
        return moeda;
    }

    public void setMoeda(float moeda) {
        if(moeda<0){
            throw new IllegalArgumentException("Numero invalido");
        }
        this.moeda = moeda;
    }

    public double calcularPreco(){
        return (this.getDistancia()*fatorPrecoInt*moeda);
    }
}
