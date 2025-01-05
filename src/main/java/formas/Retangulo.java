package formas;

public class Retangulo extends FormaGeometrica {

    private float largura;
    private float altura;

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        if(largura<0){
            throw new IllegalArgumentException("Numero invalido");
        }
        this.largura = largura;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if(altura<0){
            throw new IllegalArgumentException("Numero invalido");
        }
        this.altura = altura;
    }

    public float calcularArea() {
        return this.altura*this.largura;
    }
    public float calcularPerimetro(){
        return 2*(this.largura+this.altura);
    }
}
