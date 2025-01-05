package formas;

public class Circulo extends FormaGeometrica {

    private float raio;

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        if(raio<0){
            throw new IllegalArgumentException("Numero invalido");
        }
        this.raio = raio;
    }

    public float calcularArea() {
        return 3.14F*(this.raio*this.raio);
    }

    public float  calcularPerimetro(){
        return Math.round(2*3.14F*this.raio);
    }
}
