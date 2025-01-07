package passagens;

public class VooDomestico extends Voo{
    private double fatorPrecoDom;

    public double getfatorPrecoDom() {
        return fatorPrecoDom;
    }

    public void setfatorPrecoDom(double fatorPrecoDom) {
        if(fatorPrecoDom<0){
            throw new IllegalArgumentException("Numero invalido");
        }
        this.fatorPrecoDom = fatorPrecoDom;
    }

    public double calcularPreco(){
        return (this.getDistancia()*fatorPrecoDom);
    }
}
