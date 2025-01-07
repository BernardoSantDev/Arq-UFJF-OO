package passagens;

public abstract class Voo {
    private String origem;
    private String destino;
    private double distancia;
    

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {

        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        if(distancia<0){
            throw new IllegalArgumentException("Numero invalido");
        }
        this.distancia = distancia;
    }

    public abstract double calcularPreco();
}
