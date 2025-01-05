package pagamento;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiretorTest {

    @Test
    public void deveDiretorPosi() {
        Diretor diretor = new Diretor();
        diretor.setSalarioMensal(1000);
        diretor.setLucrosEmpresa(1000);
        assertEquals(1300,  diretor.calcularPagamento());
    }

    @Test
    public void deveDiretorNeg() {
        Diretor diretor = new Diretor();
        diretor.setSalarioMensal(1000);
        diretor.setLucrosEmpresa(-1000);
        assertEquals(1000,  diretor.calcularPagamento());
    }
}