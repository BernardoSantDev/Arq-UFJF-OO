package pagamento;

public class Diretor extends Funcionario{
    private float lucrosEmpresa;

    public float getLucrosEmpresa() {
        if(lucrosEmpresa<0){
            return 0;
        }
        return lucrosEmpresa;
    }

    public void setLucrosEmpresa(float lucrosEmpresa) {
        this.lucrosEmpresa = lucrosEmpresa;
    }

    public float calcularPagamento() {return (this.getSalarioMensal() + (this.getLucrosEmpresa()*0.3F));}

}
